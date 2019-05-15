package types;

import java.util.List;

public class Param extends AST {
    String value;
    Param param;

    public Param(String value) {
        this.value = value;
    }

    public Param(String value, Param param) {
        this.value = value;
        this.param = param;
    }
}
