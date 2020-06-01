package parser

import scala.util.parsing.combinator.Parsers

class TowerParser extends Parsers{
  override type Elem = TowerToken

//  def term : Parser[Term] = Cons("ter")
}
