package my.v1.Lexer;

import my.v1.utils.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xuzefan  2018/11/7 16:29
 */
public class Lexer {

    private String EMPTY = "";

    public List<Token> lex(String code,ArrayList<Pair<String, TokenType>> tokenExprs) {
        List<Token> tokens = new ArrayList<>();
        int pos = 0;
        final int end = code.length();
        Matcher m = Pattern.compile(this.EMPTY).matcher(code);
        m.useTransparentBounds(true).useAnchoringBounds(false);
        while (pos < end){
            m.region(pos, end);
            for (Pair<String, TokenType> r : tokenExprs)
            {
                if (m.usePattern(Pattern.compile(r.getRegex())).lookingAt())
                {
                    tokens.add(new Token(code.substring(m.start(),m.end()),r.getTokenType()));
                    pos = m.end();
                    break;
                }
            }
            pos++;  // bump-along, in case no rule matched
        }
        return  tokens;
    }
}
