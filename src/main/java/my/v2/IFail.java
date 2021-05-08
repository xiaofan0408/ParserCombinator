package my.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class IFail {

    private List<IParserFunc> parsers;

    public IFail(List<IParserFunc> parsers) {
        this.parsers = parsers;
    }

    public IFail() {
        parsers = new ArrayList<>();
        parsers.add((a) -> new Result());
    }
}
