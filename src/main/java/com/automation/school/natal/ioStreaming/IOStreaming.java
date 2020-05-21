package com.automation.school.natal.ioStreaming;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class IOStreaming {

    public static void main(String[] args) throws IOException {
        FileWriter results = null;
        String word = "kinghoods";
        try (FileReader wordList = new FileReader("src\\inPutFiles\\wordlist[2305843009214056683].txt")) {
            results = new FileWriter("src\\outPutFiles\\results.txt", true);
            writeWordRepetitions(wordList, word, results);
        } catch (IOException e) {
            System.out.println("There is an IO exception");
        } finally {
            if (results != null) {
                results.flush();
                results.close();
            }
        }
    }

    public static List<String> readFile(FileReader file) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(file);
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        return list;
    }

    public static int countWordInFile(String word, FileReader file) throws IOException {
        List<String> list = readFile(file);
        int count = 0;
        for (String s : list)
            if (s.equals(word))
                count++;
        return count;
    }

    public static void writeWordRepetitions(FileReader inFile, String word, FileWriter outFile) throws IOException {
        outFile.write("\"" + word + "\" was found " + countWordInFile(word, inFile) + " times\n");
    }
}
