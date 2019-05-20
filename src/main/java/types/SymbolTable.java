package types;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class Scope extends Hashtable<String, String> {

    final AST parent;
    List<Scope> 

    public Scope(AST parent) {
        this.parent = parent;
    }

    boolean inScope(String varName) {
        if(super.contains(varName)) {
            return true;
        }
        return parent == null ? false : parent.inScope(varName);
    }

    public void enterScope() {}

    public void exitScope() {}
}