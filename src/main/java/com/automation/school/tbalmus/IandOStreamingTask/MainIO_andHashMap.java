package com.automation.school.tbalmus.IandOStreamingTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MainIO_andHashMap {

        public static void main ( String[] args ) throws IOException {
// declare files
            FileReader inFile;
            FileWriter outFile;
            int countWord = 0;
            String myWord = "fulfils";

            inFile = new FileReader ( "src\\main\\resources\\wordlist23.txt" );
            outFile = new FileWriter ( "src\\main\\resources\\results.txt" );
            BufferedReader reader = new BufferedReader ( inFile );

            HashMap < String, ArrayList<Long> > lineNumberList = new HashMap < String ,ArrayList<Long> >(  );
            long lineNumber = 1;

            String liner;
            ArrayList<Long> lineNumbers = new ArrayList <> (  );

            while ((liner = reader.readLine ( )) != null) {
                if (liner.equals ( "fulfils" )) {
                    countWord++;
                  lineNumbers.add ( lineNumber );
                }
                lineNumber++;
            }
            lineNumberList.put ( myWord, lineNumbers );

            outFile.write ( "The word " + myWord + " was found " + countWord + " times on lines: " + lineNumbers);

            System.out.println ( lineNumberList );

            inFile.close ( );
            outFile.close ( );
            System.out.println ( "The word " + myWord + " was found " + countWord + " times." );
        }
    }
