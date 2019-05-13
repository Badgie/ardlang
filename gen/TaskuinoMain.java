//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TaskuinoMain {
    public TaskuinoMain() {
    }

    public static void main(String[] args) {
        try {
            //TODO get relative path to work.
            CharStream input = new ANTLRFileStream("C:/Users/Bruger/IdeaProjects/meh/ardlang/dreamcode/calc-sum.tsk");
            TaskuinoLexer lexer = new TaskuinoLexer(input);
            TaskuinoParser parser = new TaskuinoParser(new CommonTokenStream(lexer));
            parser.addParseListener(new TaskuinoCustomListener());
            parser.prog();
        } catch (IOException e) {
            Logger.getLogger(TaskuinoMain.class.getName()).log(Level.SEVERE, (String)null, e);
        }
    }
}
