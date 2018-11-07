package my.Lexer;

import my.utils.Pair;

import java.util.ArrayList;

/**
 * @author xuzefan  2018/11/7 16:18
 */
public class TokenMap {
    public static ArrayList<Pair<String, TokenType>> tokenExprs = new ArrayList<>();

    static {
        tokenExprs.add(new Pair<>("[ \\n\\t]+", null));
        tokenExprs.add(new Pair<>("#[^\\n]*", null));
        tokenExprs.add(new Pair<>("\\:=", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("\\(",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("\\)",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>(";",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("\\+",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("-",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("\\*",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("/",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("<=",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("<",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>(">=",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>(">",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("!=",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("=",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("and",  TokenType.RESERVED));
        tokenExprs.add(new Pair<>("or", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("not", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("if", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("then", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("else", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("while", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("do", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("end", TokenType.RESERVED));
        tokenExprs.add(new Pair<>("[0-9]+", TokenType.INT));
        tokenExprs.add(new Pair<>("[A-Za-z][A-Za-z0-9_]*", TokenType.ID));
    }
}
