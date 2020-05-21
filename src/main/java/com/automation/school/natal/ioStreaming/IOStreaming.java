package com.automation.school.natal.ioStreaming;

import java.io.*;


public class IOStreaming {

    public static void main(String[] args) throws IOException {
        // write your code here
        FileReader wordList = null;
        FileWriter results = null;
        String word = "kinghoods";

        try {
            wordList = new FileReader("src\\inPutFiles\\wordlist[2305843009214056683].txt");
            results = new FileWriter("src\\outPutFiles\\results.txt", true);
            int r = countWordInFile(word, wordList);
            System.out.println(r);
            results.write("\"" + word + "\" was found " + r + " times");

        } catch (IOException e) {
            System.out.println("There is an IO exception");
        } finally {
            if (wordList != null)
                wordList.close();
            if (results != null) {
                results.flush();
                results.close();
            }
        }

    }

    public static int countWordInFile(String word, FileReader file) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(file);
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(word))
                count++;
        }
        br.close();
        return count;
    }
}
