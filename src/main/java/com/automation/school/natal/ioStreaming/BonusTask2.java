package com.automation.school.natal.ioStreaming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BonusTask2 {
    public static void main(String[] args) throws IOException {
        FileWriter bonusResults = null;
        FileWriter bonusAllResults = null;

        try (FileReader wordList = new FileReader("src\\inPutFiles\\wordlist[2305843009214056683].txt")) {
            bonusAllResults = new FileWriter("src\\outPutFiles\\bonus2AllResults.txt", true);
            writeAllWordsDetails(wordList, bonusAllResults);
        } catch (
                IOException e) {
            System.out.println("There is an IO exception");
        } finally {
            if (bonusAllResults != null) {
                bonusAllResults.flush();
                bonusAllResults.close();
            }
        }
        try (FileReader wordList = new FileReader("src\\inPutFiles\\wordlist[2305843009214056683].txt")) {
            bonusResults = new FileWriter("src\\outPutFiles\\bonus2Results.txt", true);
            writeWordDetails(wordList, "BCE", bonusResults);
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

    public static Map<String, Details> fillMap(FileReader file) throws IOException {
        Map<String, Details> map = new HashMap<>();
        Long line = 1L;
        BufferedReader br = new BufferedReader(file);
        String word;
        while ((word = br.readLine()) != null) {
            if (!map.containsKey(word)) {
                map.put(word, new Details());
                map.get(word).addLine(line);
            } else {
                map.get(word).addLine(line);
            }
            line++;
        }
        br.close();
        return map;
    }

    public static void writeAllWordsDetails(FileReader inFile, FileWriter outFile) throws IOException {
        Map<String, Details> map = fillMap(inFile);
        for (Map.Entry<String, Details> m : map.entrySet()) {
            Details detail = m.getValue();
            outFile.write("Word \"" + m.getKey() + "\" appeared " + detail.getCount() + " times, on following lines: " + detail.displayLines() + '\n');
        }
    }

    public static void writeWordDetails(FileReader inFile, String word, FileWriter outFile) throws IOException {
        Map<String, Details> map = fillMap(inFile);
        if (map.containsKey(word)) {
            Details detail = map.get(word);
            outFile.write("Word \"" + word + "\" appeared " + detail.getCount() + " times, on following lines: " + detail.displayLines() + '\n');
        } else
            System.out.println("Word \"" + word + "\" doesn't exist in a file ");
    }
}

