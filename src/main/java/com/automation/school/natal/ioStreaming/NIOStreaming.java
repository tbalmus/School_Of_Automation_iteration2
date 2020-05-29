package com.automation.school.natal.ioStreaming;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class NIOStreaming {
    public static void main(String[] args) throws IOException {
        Path wordList = null;
        Path nioResults = null;
        String word = "BCE";

        try {
            wordList = Paths.get("src\\inPutFiles\\wordlist[2305843009214056683].txt");
            nioResults = Paths.get("src\\outPutFiles\\nioResults.txt");
            writeWordRepetitions(wordList,word,nioResults);
        } catch (IOException e) {
            System.out.println("An IO Exception has been caught");
        }
    }
public static List<String> readFile(Path path)throws IOException{
    return Files.readAllLines(path);
}
    public static int countWordInFile(String word, Path path) throws IOException {
        int count = 0;
        List<String> words = readFile(path);
        for (String content : words)
            if (word.equals(content))
                count++;
        return count;
    }
    public static void writeWordRepetitions(Path inFile, String word, Path outFile) throws IOException {
        Files.write(outFile,("\"" + word + "\" was found " + countWordInFile(word, inFile) + " times\n").getBytes());
    }
}
