/*
Create a utility class called DuplicateRemover.
*/
import java.io.*;
import java.util.*;
import java.io.File;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class DuplicateRemover
{
  private static String holdWord = null;
  private static Scanner scr = null;
  private static FileInputStream fileByteStream = null;
  private static FileOutputStream fileOutStream = null;
  private static PrintWriter writer = null;
  Map<String, String> uniqueWords = new HashMap<String, String>();

  //Create an instance method called remove that takes a single parameter called dataFile (representing the path to a text file) and uses a
  //Set of Strings to eliminate duplicate words from dataFile.
  public void remove(String dataFile) throws FileNotFoundException, IOException
  {
    fileByteStream = new FileInputStream(dataFile);
    scr = new Scanner(fileByteStream);

     while (scr.hasNextLine())
     {
       holdWord = scr.nextLine();
       uniqueWords.put(holdWord,holdWord);
     }
     fileByteStream.close();
  }
//Create an instance method called write that takes a single parameter called outputFile (representing the path to a text file) and writes
//the words contained in uniqueWords to the file pointed to by outputFile. The output file should be overwritten if it already exists, and created if it does not exist.
  public void write(String outputFile) throws FileNotFoundException, IOException
  {
    fileOutStream = new FileOutputStream(outputFile);
    writer = new PrintWriter(fileOutStream);

    for (Map.Entry<String, String> entry : uniqueWords.entrySet())
    {
        writer.println(entry.getKey());
		}
    writer.flush();

    fileByteStream.close();
  }
}
