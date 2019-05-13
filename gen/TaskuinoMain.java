//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

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
            String inputFile = "calc-sum";
            //TODO get relative path to work.
            CharStream input = new ANTLRFileStream("C:/Users/Bruger/IdeaProjects/meh/ardlang/dreamcode/" + inputFile + ".tsk");
            TaskuinoLexer lexer = new TaskuinoLexer(input);
            TaskuinoParser parser = new TaskuinoParser(new CommonTokenStream(lexer));

            FileWriter fileWriter = new FileWriter(inputFile+".c");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("test1");
            printWriter.println("test 2");

            printWriter.close();
            //parser.addParseListener(new TaskuinoCustomListener());
            //parser.prog();
        } catch (IOException e) {
            Logger.getLogger(TaskuinoMain.class.getName()).log(Level.SEVERE, (String)null, e);
        }
    }
}
