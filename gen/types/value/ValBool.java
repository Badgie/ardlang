package types.value;

public class ValBool extends Val {
    boolean value;
    String identifier;

    public ValBool(boolean value) {
        this.value = value;
    }

    public ValBool(String identifier) {
        this.identifier = identifier;
    }
}
