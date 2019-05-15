package types;

import types.stmts.Stmts;

import java.util.ArrayList;
import java.util.List;

public class Prog extends AST {
    List<Stmts> stmts;

    public Prog(List<Stmts> stmts) {
        this.stmts = stmts;
    }
}
