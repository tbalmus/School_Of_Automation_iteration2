package IOtask;

import java.io.*;
import java.util.Iterator;
import java.util.Map;

import static IOtask.Count.countTheWord;

public class FileReadWrite {

    public static void main(String[] args) throws IOException {

        FileReader listOfWords = null;
        FileReader mapOfResults;
        FileWriter result = null;
        String word = "Mid-february";

      try {
          listOfWords = new FileReader("src/IOtask/wordlist[2305843009214056683].txt");
          result = new FileWriter("src/IOtask/result.txt");
          int res = countTheWord(word, listOfWords);
          System.out.println(res);
          result.write(word + " was found " + res + " times");

          System.out.print(word + " was found " + res + " times on lines: ");
          mapOfResults = new FileReader("src/IOtask/wordlist[2305843009214056683].txt");
          for (Map.Entry<Long, String> re : MapResult.mapTheWord(word, mapOfResults).entrySet())
              System.out.print(re.getKey() + " ");
      }
      catch (IOException e) {
          System.out.println(e);
      }
      finally {
          if (listOfWords != null)
              listOfWords.close();
          if (result != null)
              result.close();
      }



//        public static void printMap(Map mapOfResults) {
//            mapOfResults = new FileReader("src/IOtask/wordlist[2305843009214056683].txt");
//            Iterator it = MapResult.mapTheWord(word, mapOfResults).entrySet().iterator();
//            while (it.hasNext()) {
//                Map.Entry pair = (Map.Entry) it.next();
//                System.out.print(pair.getKey() + " ");
//            }
//        }
    }


}
