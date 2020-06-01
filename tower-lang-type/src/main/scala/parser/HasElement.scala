package parser

sealed trait EmptyP

sealed trait Context[+T]

case object EmptyC extends Context[EmptyP]
case class ConsC[T, TT](t : T, ctx : Context[TT]) extends Context[(T, TT)]

trait HasElement[A, C] {
  def get(ctx : C) : A
}

object HasElement {
  implicit def consHasElement[T, TT] : HasElement[T, Context[(T, TT)]] = {
    new HasElement[T, Context[(T, TT)]] {
      override def get(ctx: Context[(T, TT)]): T = {
        ctx match {
          //case EmptyC => ??? // pas possible
          case ConsC(t, ctx) => t
        }
      }
    }
  }

  implicit def nestedCtxHasElement[A, T, TT] (implicit p : HasElement[A, Context[TT]]) : HasElement[A, Context[(T, TT)]] = {
    new HasElement[A, Context[(T, TT)]] {
      override def get(ctx: Context[(T, TT)]): A = {
        ctx match {
          case ConsC(t, ctx) => p.get(ctx)
        }
      }
    }
  }

  def testFct[T](ctx : Context[T]) (implicit p : HasElement[String, Context[T]]) : String = p.get(ctx)

  val testCtx1 = ConsC("truc", EmptyC)
  val testCtx2 = ConsC(1, ConsC("truc", EmptyC))

  def main(args: Array[String]): Unit = {
    val res : String = testFct(testCtx1)
  }
}
