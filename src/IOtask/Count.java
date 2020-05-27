package IOtask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {

    public static int countTheWord(String word, FileReader file) throws IOException {
        int count = 0;
        String text = "";
        BufferedReader fileRead = new BufferedReader(file);

        int c;
        while ((c = file.read()) != -1) {
            text = fileRead.readLine();
            if (text.equals(word))
                count++;
        }
        return count;
    }
}
