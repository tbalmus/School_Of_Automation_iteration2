package com.automation.school.natal.ioStreaming;


import java.io.*;
import java.util.*;

public class BonusTask {
    public static void main(String[] args) throws IOException {

        FileWriter bonusResults = null;

        try (FileReader wordList = new FileReader("src\\wordlist[2305843009214056683].txt")) {
            bonusResults = new FileWriter("src\\bonusResults.txt", true);
            writeWordDetails(wordList, "allege", bonusResults);
        } catch (
                IOException e) {
            System.out.println("There is an IO exception");
        } finally {
            if (bonusResults != null) {
                bonusResults.flush();
                bonusResults.close();
            }
        }
    }

    public static Map<Long, String> fillMap(FileReader file) throws IOException {
        Map<Long, String> map = new HashMap<>();
        Long line = 1L;
        BufferedReader br = new BufferedReader(file);
        String word;
        while ((word = br.readLine()) != null) {
            map.put(line, word);
            line++;
        }
        br.close();
        file.close();
        return map;
    }

    public static List<Long> identifyLines(FileReader file, String word) throws IOException {
        Map<Long, String> map = fillMap(file);
        List<Long> lines = new ArrayList<>();
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            if (entry.getValue().equals(word))
                lines.add(entry.getKey());
        }
        System.out.println("All the lines where appeared word \"" + word + "\" were identified: " + lines.size());
        return lines;
    }

    public static void writeWordDetails(FileReader inFile, String word, FileWriter outFile) throws IOException {
        List<Long> list = identifyLines(inFile, word);
        outFile.write("\"" + word + "\" was found " + list.size() + " times on lines: ");
        for (Long line : list)
            outFile.write(line + "; ");
        outFile.write("\n");
    }
}
