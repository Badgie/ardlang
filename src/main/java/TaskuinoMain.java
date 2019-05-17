import dk.aau.cs.sw411.antlr.TaskuinoLexer;
import dk.aau.cs.sw411.antlr.TaskuinoParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import types.AST;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TaskuinoMain {
    public TaskuinoMain() {
    }

    public static void main(String[] args) {

        try {
            String files[] = {"led", "calc-sum", "spin-servo"};
            for (int i = 0; i < files.length; i++) {
                CharStream input = new ANTLRFileStream("./dreamcode/" + files[i] + ".tsk");
                TaskuinoLexer lexer = new TaskuinoLexer(input);
                TokenStream tokens = new CommonTokenStream(lexer);
                TaskuinoParser parser = new TaskuinoParser(tokens);
                TaskuinoCustomVisitor visitor = new TaskuinoCustomVisitor();
                AST prog = visitor.parse(parser.prog());

                System.out.println(prog);
            }


        } catch (IOException e) {
            Logger.getLogger(TaskuinoMain.class.getName()).log(Level.SEVERE, (String) null, e);
        }
    }
}
