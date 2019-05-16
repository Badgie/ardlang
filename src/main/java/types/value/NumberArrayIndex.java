package types.value;

public class NumberArrayIndex extends ValNumber {
    String identifier;
    ValNumber index;

    public NumberArrayIndex(String identifier, ValNumber index) {
        this.identifier = identifier;
        this.index = index;
    }
}
