package types.operator;

import types.AST;

public abstract class Operator extends AST {
    //arithmetics
    public static class Add extends Operator {
        String op;

        public Add() {
            this.op = "+";
        }
    }

    public static class Sub extends Operator {
        String op;

        public Sub() {
            this.op = "-";
        }
    }

    public static class Mult extends Operator {
        String op;

        public Mult() {
            this.op = "*";
        }
    }

    public static class Div extends Operator {
        String op;

        public Div() {
            this.op = "/";
        }
    }

    public static class Mod extends Operator {
        String op;

        public Mod() {
            this.op = "%";
        }
    }

    public static class Incr extends Operator {
        String op;

        public Incr() {
            this.op = "++";
        }
    }

    public static class Decr extends Operator {
        String op;

        public Decr() {
            this.op = "--";
        }
    }

    public static class Assign extends Operator {
        String op;

        public Assign() {
            this.op = "=";
        }
    }

    //boolean
    public static class Equal extends Operator {
        String op;

        public Equal() {
            this.op = "is";
        }
    }

    public static class Greater extends Operator {
        String op;

        public Greater() {
            this.op = ">";
        }
    }

    public static class Lesser extends Operator {
        String op;

        public Lesser() {
            this.op = "<";
        }
    }

    public static class GreaterEqual extends Operator {
        String op;

        public GreaterEqual() {
            this.op = ">=";
        }
    }

    public static class LesserEqual extends Operator {
        String op;

        public LesserEqual() {
            this.op = "<=";
        }
    }

    public static class Or extends Operator {
        String op;

        public Or() {
            this.op = "or";
        }
    }

    public static class Xor extends Operator {
        String op;

        public Xor() {
            this.op = "xor";
        }
    }

    public static class And extends Operator {
        String op;

        public And() {
            this.op = "and";
        }
    }

    public static class Not extends Operator {
        String op;

        public Not() {
            this.op = "!";
        }
    }
}
