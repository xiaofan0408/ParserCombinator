package my.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author xuzefan  2018/11/7 16:19
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pair<T1,T2> {
    T1 regex;
    T2 tokenType;
}
