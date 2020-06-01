package parser

sealed trait TowerToken {

}

case object INDENT extends TowerToken
case object DEDENT extends TowerToken
case class SPACE(n : Int) extends TowerToken
case class NEWLINE(n : Int) extends TowerToken
case class Symbol(s : String) extends TowerToken
