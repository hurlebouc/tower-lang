package parser

import scala.annotation.tailrec
import scala.util.parsing.combinator.RegexParsers

class TowerLexer extends RegexParsers {
  override def skipWhitespace = false;

  def nl : Parser[NEWLINE] = "\n[ ]*".r ^^ { s => NEWLINE(s.length - 1) }
  def space : Parser[SPACE] = "[ ]+".r ^^ {s => SPACE(s.length)}
  def symbol : Parser[Symbol] = """[^\s\n]+""".r ^^ {s => Symbol(s)}
  def tokenizer: Parser[List[TowerToken]] = (nl | space | symbol).* >> {token => setIndentation(token, ::(0, Nil), Nil)}

  @tailrec
  final def setIndentation(v : List[TowerToken], level : List[Int], res : List[TowerToken]) : Parser[List[TowerToken]] = {
    v match {
      case ::(head, tl) => head match {
        case INDENT => setIndentation(tl, level, ::(INDENT, res))
        case DEDENT => setIndentation(tl, level, ::(INDENT, res))
        case SPACE(n) => setIndentation(tl, level, res)
        case NEWLINE(n) => level match {
          case Nil => err("cas impossible normalement")
          case ::(curLevel, tlLevel) =>
            if (n == curLevel) {
              setIndentation(tl, level, ::(NEWLINE(0), res))
            } else if (n > curLevel) {
              setIndentation(tl, ::(n, level), ::(INDENT, res))
            } else {
              setIndentation(v, tlLevel, ::(DEDENT, res))
            }


//            {
//              tlLevel match {
//                case Nil => err("pas possible car le niveau minimal doit être 0 alors que le niveau atteint est " + n)
//                case ::(prevLevel, _) =>
//                  if (n == prevLevel) {
//                    setIndentation(tl, tlLevel, ::(DEDENT, res))
//                  } else if (n < prevLevel){
//                    setIndentation(v, )
//                  } else {
//                    err("la désindentation doit se faire exactement au niveau précédent")
//                  }
//              }
//          }
        }
        case Symbol(s) => setIndentation(tl, level, ::(Symbol(s), res))
      }
      case Nil => success(res.reverse)
    }
  }
//  def space : Parser[Int] = " " ^^ {_.length}
//  def number: Parser[Int] = """(0|[1-9]\d*)""".r ^^ { _.toInt }
//  def varID : Parser[VarID] = "[a-z][a-zA-Z]*".r ^^ {VarID}
//  def consID : Parser[ConsID] = "[A-Z][a-zA-Z]*".r ^^ {ConsID}

}
