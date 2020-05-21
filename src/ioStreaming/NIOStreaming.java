package ioStreaming;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class NIOStreaming {
    public static void main(String[] args) throws IOException {
        Path wordList = null;
        Path nioResults = null;
        String word = "kinghoods";

        try {
            wordList = Paths.get("src\\wordlist[2305843009214056683].txt");
            int r = countWordInFile(word, wordList);
            nioResults = Paths.get("src\\nioResults.txt");
            Files.write(nioResults, ("\"" + word + "\" was found " + r + " times").getBytes());
        } catch (IOException e) {
            System.out.println("An IO Exception has been caught");
        }
    }

    public static int countWordInFile(String word, Path path) throws IOException {
        int count = 0;
        List<String> words = Files.readAllLines(path);
        for (String content : words)
            if (word.equals(content))
                count++;
        return count;
    }
}
