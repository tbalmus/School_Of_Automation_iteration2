package com.automation.school.nluchian.IOStreamsTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

class IOTask {

    public static void main(String[] args) throws IOException {
        FileReader wordlist = null;
        FileWriter destinationFile = null;
        String word = "brolly";

        try {
            wordlist = new FileReader("src/main/java/com/automation/school/nluchian/IOStreamsTask/files/wordlist.txt");
            destinationFile = new FileWriter("src/main/java/com/automation/school/nluchian/IOStreamsTask/files/result.txt", true);
            int method = countWordInFile(word, wordlist);
            destinationFile.write(word + " " + "found " + method + " times");


        } catch (IOException e) {
            System.out.println("IO exception found");
        } finally {
            if (wordlist != null)
                wordlist.close();
            if (destinationFile != null)
                destinationFile.close();
        }
    }

    public static int countWordInFile(String word, FileReader file) throws IOException {
        int count = 0;
        String s;
        LineNumberReader br = new LineNumberReader(file);
        int c;
        while ((c = file.read()) != -1) {
            s = br.readLine();
            if (s.equals(word))
                count++;
        }
        br.close();
        return count;
    }
}
