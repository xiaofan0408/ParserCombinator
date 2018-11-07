package my;

import my.Lexer.Lexer;
import my.Lexer.Token;
import my.Lexer.TokenMap;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String code = "if 1 < 2 then x := 1 else x := 2 end";
        Lexer lexer = new Lexer();
        List<Token> tokens = lexer.lex(code, TokenMap.tokenExprs);
        tokens.stream().forEach(token -> {
            System.out.println(token.toString());
        });
    }
}
