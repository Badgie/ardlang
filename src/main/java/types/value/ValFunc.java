package types.value;

import types.Param;

import java.util.List;

public class ValFunc extends Val {
    String identifier;
    List<Param> params;

    public ValFunc(String identifier, List<Param> params) {
        this.identifier = identifier;
        this.params = params;
    }
}
