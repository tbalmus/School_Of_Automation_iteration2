package com.automation.school.tbalmus.IandOStreamingTask;

import java.io.*;
import java.util.ArrayList;

public class MainIO {

    public static void main ( String[] args ) throws IOException {
// declare files
        FileReader inFile;
        FileWriter outFile;
        int countWord = 0;
        String myWord = "fulfils";

        inFile = new FileReader ( "src\\main\\resources\\wordlist23.txt" );
        outFile = new FileWriter ( "src\\main\\resources\\results.txt" );
        BufferedReader reader = new BufferedReader ( inFile );

        ArrayList < Long > lineNumberList = new ArrayList <> ( );
        long lineNumber = 1;
        String liner;
        while ((liner = reader.readLine ( )) != null) {
            lineNumber++;
            if (liner.equals ( "fulfils" )) {
                countWord++;
                lineNumberList.add ( lineNumber );
            }

        }

        outFile.write ( "The word " + myWord + " was found " + countWord + " times on lines: " + lineNumberList );

        System.out.println ( lineNumberList );

        inFile.close ( );
        outFile.close ( );
        System.out.println ( "The word " + myWord + " was found " + countWord + " times." );
    }
}