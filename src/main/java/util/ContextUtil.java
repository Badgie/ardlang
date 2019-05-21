package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContextUtil {

    public List<String> getSourceAsList(String file) {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("./dreamcode/" + file + ".tsk"));
            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : lines) {
            s = s.replace("\n", "");
            s = s.replace("\r", "");
        }

        if (lines.size() != 0) {
            return lines;
        } else {
            throw new Error("could not read input file");
        }
    }
}
