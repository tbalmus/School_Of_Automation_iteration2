package IOtask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MapResult {

    public static Map<Long, String> mapTheWord(String word, FileReader file) throws IOException {
        Map<Long, String> mapResult = new TreeMap<>();
        String text = "";
        BufferedReader fileRead = new BufferedReader(file);

        int c;
        Long i = 0l;
        while ((c = file.read()) != -1) {
            i++;
            text = fileRead.readLine();
            if (text.equals(word))
                mapResult.put(i, word);
        }
        return mapResult;
    }

}
