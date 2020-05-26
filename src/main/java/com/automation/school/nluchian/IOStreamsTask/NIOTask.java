package com.automation.school.nluchian.IOStreamsTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class NIOTask {
    public static void main(String[] args) throws IOException {

        Path nioFileRead;
        Path nioFileWrite;
        String word = "brolly";

        try {
            nioFileRead = Paths.get("src/main/java/com/automation/school/nluchian/IOStreamsTask/files/wordlist.txt");
            int method = countWordInFile(word, nioFileRead);
            nioFileWrite = Paths.get("src/main/java/com/automation/school/nluchian/IOStreamsTask/files/nioResult.txt");
            Files.write(nioFileWrite, (word + " was found " + method + " times  ").getBytes());
        } catch(IOException e){
            System.out.println("IO exception found");
        }
    }

    public static int countWordInFile(String word, Path path) throws IOException {
        int count = 0;
        List<String> words = readAllLines(path);
        for (String x : words)
            if (word.equals(x))
                count++;
        return count;
    }


}
