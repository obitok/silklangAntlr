package main;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import picocli.CommandLine;
import silkgrammar.SilkGrammarLexer;
import silkgrammar.SilkGrammarParser;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class silkmain  {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("> ");
            input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            SilkGrammarLexer lexer = new SilkGrammarLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SilkGrammarParser parser = new SilkGrammarParser(tokens);
            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree());
        }while(!input.equalsIgnoreCase("exit"));
        System.exit(0);
    }

}