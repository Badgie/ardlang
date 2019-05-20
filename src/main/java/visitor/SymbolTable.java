package visitor;

import types.AST;
import types.Type;

import java.util.*;

public class SymbolTable extends HashMap<String, Type> {

    AST parent;
    List<SymbolTable> symbolTables;

    public SymbolTable(Map<? extends String,? extends Type> c, AST parent) {
        super(c);
        this.parent = parent;
    }

    public SymbolTable(List<SymbolTable> symbolTables) {
        this.symbolTables = symbolTables;
    }

    boolean inScope(String varName) {
        if(super.containsKey(varName)) {
            return true;
        }
        return parent != null && this.inScope(varName);
    }

    public void checkDeclaration(String id, Type type) {
        if (!(this.symbolTables.get(this.symbolTables.size() - 1).containsKey(id))) {
            System.out.println("Variable " + id + " is valid, adding to symbol table");
            this.symbolTables.get(this.symbolTables.size() - 1).put(id, type);
        } else {
            throw new Error("variable already declared");
        }
    }

    public void enterScope(AST parent) {
        this.symbolTables.add(new SymbolTable(
                new HashMap<>(),
                parent
        ));
    }

    public void exitScope() {
        this.symbolTables.remove(this.symbolTables.size() - 1);
    }

}