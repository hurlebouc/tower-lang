package parser

sealed trait Term {

  type Environment  = Seq[TypedVar]
  type Constants    = Set[TypedCons]
//  type Axioms       = Set[(Univ, Univ)]
  type Rules        = Set[(Univ, Univ, Univ)]

  def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term]
}

case class Univ(level : Int) extends Term {
  override def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term] = {
    Right(Univ(level + 1))
  }
}
case class Cons(id : String) extends Term {
  override def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term] = {
    constants.find(typedCons => typedCons.x == this) match {
      case Some(typedCons) => Right(typedCons.typ)
      case None => Left("Unknown constructor" + id)
    }
  }
}
case class Var(id : String) extends Term {
  override def getType(environment: Environment, constants: Constants, R: Rules): Either[String, Term] = {
    environment.find(p => p.x == this) match {
      case Some(value) => Right(value.typ)
      case None => Left("Unknown variable " + id);
    }
  }
}
case class App(a : Term, b : Term) extends Term {
  override def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term] = {
    a.getType(environment, constants, rules)
    b.getType(environment, constants, rules)
  }
}
case class Abs(vars : Seq[TypedVar], t : Term) extends Term {
  override def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term] = ???
}
case class Pi(vars : Seq[TypedVar], t : Term) extends Term {
  override def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term] = ???
} //forall utilise ça
case class Let(defs : Seq[Definition], t : Term) extends Term {
  override def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term] = ???
}
case class Case(t : Term, pat : Seq[Pattern]) extends Term {
  override def getType(environment: Environment, constants: Constants, rules: Rules): Either[String, Term] = ???
}

case class TypedVar(x : Var, typ : Term)
case class TypedCons(x : Cons, typ : Term)

case class Binder(x : Var, args : Seq[TypedVar])
case class Definition(binder : Binder, t : Term)

case class Pattern(c : Cons, vars : Seq[Var])
