package fr.pointfixe

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.{TowerLexer, TowerParser}
import simple.syntax.{SyntaxLexer, SyntaxParser, SyntaxVisitor}

/**
 * @author ${user.name}
 */
object App extends TowerLexer {

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    val lexer = new SyntaxLexer(CharStreams.fromString("def f = U"));
    val parser = new SyntaxParser(new CommonTokenStream(lexer))
    val start = parser.start

    println("début")
    parse(tokenizer, "if n == 2 :\n ytuc\n machin\n  deux\n  deux'\ndone") match {
      case Success(result, next) => println(result)
      case Error(msg, next) => println(msg)
      case Failure(msg, next) => println(msg)
    }
  }
}
