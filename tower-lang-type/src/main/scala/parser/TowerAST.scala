package parser

import scala.util.{Failure, Success, Try}

sealed trait Term {


  type Environment  = Seq[TypedVar]
  type Constants    = Set[TypedCons]
//  type Axioms       = Set[(Univ, Univ)] : // ici : (Univ(n), Univ(m)) \in A <=> m = n+1
//  type Rules        = Set[(Univ, Univ, Univ)] // ici : (Univ(n), Univ(m), Univ(p)) \in R <=> n = m = p+1


  implicit def weakReduce[T](reduced: Reduced[T]) : T = {
    reduced.t
  }

  implicit def typedStrongReduce(typed: Typed) : Reduced[Term] = {
    ???
  }

  implicit def univReduced(univ: Univ) : Reduced[Univ] = {
    Reduced(univ)
  }
  implicit def varReduced(v: Var) : Reduced[Var] = {
    Reduced(v)
  }
  implicit def consReduced(cons: Cons) : Reduced[Cons] = {
    Reduced(cons)
  }

  def getType(environment: Environment, constants: Constants): Try[Typed]

}
case class Reduced[+T](t : T)

case class Typed(term: Term, typ: Reduced[Term])

object Errors {
  case class SimpleException(s : String) extends Exception
  implicit def toThrowable(s : String) : SimpleException = {
    SimpleException(s)
  }
}

import Errors._

case class Univ(level : Int) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = {
    Success(Typed(this, Univ(level + 1)))
  }
}
case class Cons(id : String) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = {
    constants.find(typedCons => typedCons.x == this) match {
      case Some(typedCons) =>
        for {
          typ <- typedCons.typ.getType(environment, constants) // à vérifier
        } yield Typed(this, typ)
      case None => Failure("Unknown constructor" + id)
    }
  }
}
case class Var(id : Int) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = {
    for {
      typeEnv <- Try(environment.apply(id))
      kind <- typeEnv.typ.getType(environment, constants)
    } yield Typed(this, kind)
  }
}
case class App(a : Term, b : Term) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = {
    for {
      typea <- a.getType(environment, constants)
      typeb <- b.getType(environment, constants)
    } yield {

    }
  }
}
case class Abs(vars : List[TypedVar], t : Term) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = ???
}
case class Pi(vars : List[TypedVar], t : Term) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = ???
} //forall utilise ça
case class Let(defs : Seq[Definition], t : Term) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = ???
}
case class Case(t : Term, pat : Seq[Pattern]) extends Term {
  override def getType(environment: Environment, constants: Constants): Try[Typed] = ???
}

case class TypedVar(typ : Term)
case class TypedCons(x : Cons, typ : Term)

case class Binder(args : Seq[TypedVar])
case class Definition(binder : Binder, t : Term)

case class Pattern(c : Cons, vars : Seq[Var])
