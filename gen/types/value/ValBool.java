package types.value;

public class ValBool extends Val {
    boolean value;
    String identifier;

    public ValBool(boolean value, String identifier) {
        this.value = value;
        this.identifier = identifier;
    }
}
