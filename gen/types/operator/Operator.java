package types.operator;

import types.AST;

public abstract class Operator extends AST {
    //arithmetics
    public class Add extends Operator {
        String op;

        public Add() {
            this.op = "+";
        }
    }

    public class Sub extends Operator {
        String op;

        public Sub() {
            this.op = "-";
        }
    }

    public class Mult extends Operator {
        String op;

        public Mult() {
            this.op = "*";
        }
    }

    public class Div extends Operator {
        String op;

        public Div() {
            this.op = "/";
        }
    }

    public class Mod extends Operator {
        String op;

        public Mod() {
            this.op = "%";
        }
    }

    public class Incr extends Operator {
        String op;

        public Incr() {
            this.op = "++";
        }
    }

    public class Decr extends Operator {
        String op;

        public Decr() {
            this.op = "--";
        }
    }

    public class Assign extends Operator {
        String op;

        public Assign() {
            this.op = "=";
        }
    }

    //boolean
    public class Equal extends Operator {
        String op;

        public Equal() {
            this.op = "is";
        }
    }

    public class Greater extends Operator {
        String op;

        public Greater() {
            this.op = ">";
        }
    }

    public class Lesser extends Operator {
        String op;

        public Lesser() {
            this.op = "<";
        }
    }

    public class GreaterEqual extends Operator {
        String op;

        public GreaterEqual() {
            this.op = ">=";
        }
    }

    public class LesserEqual extends Operator {
        String op;

        public LesserEqual() {
            this.op = "<=";
        }
    }

    public class Or extends Operator {
        String op;

        public Or() {
            this.op = "or";
        }
    }

    public class Xor extends Operator {
        String op;

        public Xor() {
            this.op = "xor";
        }
    }

    public class And extends Operator {
        String op;

        public And() {
            this.op = "and";
        }
    }

    public class Not extends Operator {
        String op;

        public Not() {
            this.op = "!";
        }
    }
}
