package my.v1.Lexer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author xuzefan  2018/11/7 16:18
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Token {
    private String value;
    private TokenType type;

    @Override
    public String toString() {
        return "Token{" +
                "value='" + value + '\'' +
                ", type=" + type +
                '}';
    }
}
