import java.io.*;
import java.util.*;
import java.io.File;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter
{
  //instance variable called wordCounter
  //private static int wordCounter = 0;
  private static String holdWord;
  private static int holdVal;
  private static int i = 0;
  private static Scanner scr = null;
  private static FileInputStream fileByteStream = null;
  private static FileOutputStream fileOutStream = null;
  private static PrintWriter writer = null;
  Map<String, Integer> wordCounter = new HashMap<String, Integer>();

  //Create an instance method called count that takes a single parameter called dataFile
  //uses a Map of Strings to count how many times each word occurs in dataFile.
  public void count(String dataFile) throws FileNotFoundException, IOException
  {
    fileByteStream = new FileInputStream(dataFile);
    scr = new Scanner(fileByteStream);

    while (scr.hasNextLine())
    {
      holdWord = scr.nextLine();
      if(wordCounter.containsKey(holdWord) && i > 0)
      {
        holdVal = wordCounter.get(holdWord);
        wordCounter.put(holdWord,holdVal + 1);
      }
      else
      {
        wordCounter.put(holdWord, 1);
        i++;
      }
    }
    fileByteStream.close();

  }
  //Create an instance method called write that takes a single parameter called outputFile
  //writes the contents of wordCounter to the file pointed to by outputFile.
  public void write(String outputFile) throws FileNotFoundException, IOException
  {
    fileOutStream = new FileOutputStream(outputFile);
    writer = new PrintWriter(fileOutStream);

    for (Map.Entry<String, Integer> entry : wordCounter.entrySet())
    {
        writer.println(entry.getKey() + " " + entry.getValue());
    }
    writer.flush();

    fileByteStream.close();
  }
}
