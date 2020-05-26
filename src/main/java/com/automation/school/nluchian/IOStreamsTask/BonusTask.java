package com.automation.school.nluchian.IOStreamsTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BonusTask {
    static Map<String, List<Long>> newMap = new HashMap<>();
    static FileReader wordlist;
    static FileWriter destinationFile;
    static String word = "brolly";

    static {
        try {
            destinationFile = new FileWriter("src/main/java/com/automation/school/nluchian/IOStreamsTask/files/outPut.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        wordlist = new FileReader("src/main/java/com/automation/school/nluchian/IOStreamsTask/files/wordlist.txt");
        List<Long> newList = countWordInFile(word, wordlist);
        newMap.put(word, newList);
        String method = word + " was found " + newMap.get(word).size() + " times on lines: " + newMap.get(word);
        System.out.println(method);
        destinationFile.write(method);
        destinationFile.close();
    }

    public static List<Long> countWordInFile(String word, FileReader file) throws IOException {
        List<Long> list = new ArrayList();
        String s;
        LineNumberReader br = new LineNumberReader(file);
        int rowNumber = 1;
        while (file.read() != -1) {
            s = br.readLine();
            if (s.equals(word)) {
                list.add((long) rowNumber);
            }
            rowNumber++;
        }
        br.close();
        return list;
    }
}
