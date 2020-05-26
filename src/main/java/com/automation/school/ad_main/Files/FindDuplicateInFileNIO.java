package com.automation.school.ad_main.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FindDuplicateInFileNIO {
    public static void main(String[] args) {
        String fileInputPath = "src/main/java/com/automation/school/ad_main/Files/FilesLocation/InputFile.txt";
        String fileOutPath = "src/main/java/com/automation/school/ad_main/Files/FilesLocation/outNioFile.txt";
        Path pathIn = Paths.get(fileInputPath);
        Path pathOut = Paths.get(fileOutPath);
        Set<String> uniqueLines = new LinkedHashSet<>();
        Map<String, Integer> countMap = new HashMap<>();
        List<String> duplicateList = new ArrayList<>();
        String line;

        try {
            BufferedReader reader = Files.newBufferedReader(pathIn);
            while ((line = reader.readLine()) != null) {
                if (!uniqueLines.add(line)) {
                    duplicateList.add(line);
                }

            }
            String lineListStr = String.join("\n", duplicateList);
            Files.write(pathOut, lineListStr.getBytes(StandardCharsets.UTF_8));

            BufferedReader readerOut = Files.newBufferedReader(pathOut);
            while ((line = readerOut.readLine()) != null) {
                if (countMap.containsKey(line)) {
                    countMap.put(line, countMap.get(line) + 1);
                } else {
                    countMap.put(line, 1);
                }

            }
            List<String> mLines = new ArrayList<>();
            countMap.forEach((key, value) -> mLines.add("Word: " + key + " occurs " + value + " times."));
            Files.write(pathOut, mLines, StandardCharsets.UTF_8);

        } catch (IOException e) {
            System.out.println("File exist");
        }


    }
}
