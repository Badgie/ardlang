import dk.aau.cs.sw411.antlr.TaskuinoLexer;
import dk.aau.cs.sw411.antlr.TaskuinoParser;
import dk.aau.cs.sw411.antlr.TaskuinoVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import types.Prog;


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
                TaskuinoCustomVisitor visitor = new TaskuinoCustomVisitor();
                Prog p = visitor.parse(input);

                System.out.println(p);
            }

            /*TaskuinoLexer lexer = new TaskuinoLexer(input);
            TaskuinoParser parser = new TaskuinoParser(new CommonTokenStream(lexer));

            FileWriter fileWriter = new FileWriter(inputFile + ".c");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("test1");
            printWriter.println("test 2");

            printWriter.close();
            //parser.addParseListener(new TaskuinoCustomListener());
            //parser.prog();*/
        } catch (IOException e) {
            Logger.getLogger(TaskuinoMain.class.getName()).log(Level.SEVERE, (String) null, e);
        }
    }
}
