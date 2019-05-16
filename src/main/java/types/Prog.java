package types;

import java.util.List;

import types.stmts.Stmts;

//TODO: note that stmts are actually a list of stmt - FIX!

public class Prog extends AST {
    List<Stmts> stmts;

    public Prog(List<Stmts> stmts) {
        this.stmts = stmts;
    }
}
