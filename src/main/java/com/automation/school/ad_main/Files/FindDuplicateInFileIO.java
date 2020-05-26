package com.automation.school.ad_main.Files;

import java.io.*;
import java.util.*;

public class FindDuplicateInFileIO {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/automation/school/ad_main/Files/FilesLocation/inputFile.txt"));
        Set<String> uniqueSet = new HashSet<>(); // maybe should be bigger
        List<String> duplicateList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();
        String line;


        //it compare to uniqueSet
        while ((line = reader.readLine()) != null)
            if (!uniqueSet.add(line)) {
                duplicateList.add(line);

            }
        reader.close();

        BufferedWriter duplicatefileWriter = new BufferedWriter(new FileWriter("src/main/java/com/automation/school/ad_main/Files/FilesLocation/outIoFile.txt"));
        for (String duplicateline : duplicateList) {
            duplicatefileWriter.write(duplicateline);
            duplicatefileWriter.newLine();
        }
        duplicatefileWriter.close();
        //bonus

        BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/automation/school/ad_main/Files/FilesLocation/outIoFile.txt"));
        while ((line = br.readLine()) != null) {
            if (countMap.containsKey(line)) {
                countMap.put(line, countMap.get(line) + 1);
            } else {
                countMap.put(line, 2);
            }
        }
        //  countMap.forEach((k,v)->{System.out.println("Word: " +k+" occurs "+v+" times.");});

        countMap.forEach((k, v) -> resultList.add("Word: " + k + " occurs " + v + " times."));

        BufferedWriter resultListWriter = new BufferedWriter(new FileWriter("src/main/java/com/automation/school/ad_main/Files/FilesLocation/resultIOFile.txt"));
        for (String resultListLine : resultList) {
            resultListWriter.write(resultListLine);
            resultListWriter.newLine();
        }
        resultListWriter.close();


    }
}


