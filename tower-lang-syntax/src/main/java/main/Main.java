package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import python.syntax.PythonLexer;
import python.syntax.PythonParser;

public class Main {
    public static void main(String[] args) {
//        SyntaxLexer lexer = new SyntaxLexer(CharStreams.fromString("a\n  b\n\n"));
//        SyntaxParser parser = new SyntaxParser(new CommonTokenStream(lexer));
//        parser.test();

        PythonLexer pythonLexer = new PythonLexer(CharStreams.fromString("\n" +
                "if i == 1:\n" +
                "    j = 0"));
        PythonParser pythonParser = new PythonParser(new CommonTokenStream(pythonLexer));
        pythonParser.file_input();
    }
}
