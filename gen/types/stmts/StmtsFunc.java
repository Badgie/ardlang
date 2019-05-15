package types.stmts;

import types.AST;

import java.util.List;

public class StmtsFunc extends Stmts {
    String identifier;
    //parameter list?
    List<Stmts> stmts;
}
