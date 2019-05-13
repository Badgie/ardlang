package types;

import java.util.List;

//TODO: note that stmts are actually a list of stmt - FIX!
public class Prog {
    String id;
    List<Stmt> stmts;

    public Prog(String id, List<Stmt> stmts) {
        this.id = id;
        this.stmts = stmts;
    }
}
