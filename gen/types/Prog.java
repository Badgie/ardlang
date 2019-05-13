package types;

import java.util.ArrayList;
import java.util.List;

public class Prog {
    String id;
    List<Stmts> stmts;

    public Prog(String id, List<Stmts> stmts) {
        this.id = id;
        this.stmts = stmts;
    }
}
