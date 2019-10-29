/*
Create a utility class called DuplicateRemover.

The unique words should be stored in an instance variable called uniqueWords.


Create a separate class called Application that contains a main method which illustrates the use of DuplicateRemover
by calling both the remove and write methods. Your input file must be called problem1.txt and your output file must be called unique_words.txt.

*/
import java.io.File;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class DuplicateRemover
{
  private static String[] uniqueWords = new String[100];
  private static String[] uniqueWordsCheck = new String[100];
  private static String holdWord = null;
  private static Scanner scr = null;
  private static FileInputStream fileByteStream = null;
  private static FileOutputStream fileOutStream = null;
  private static int i;
  private static PrintWriter writer = null;
  private static boolean isSame = false;

  //Create an instance method called remove that takes a single parameter called dataFile (representing the path to a text file) and uses a
  //Set of Strings to eliminate duplicate words from dataFile.
  public void remove(String dataFile) throws FileNotFoundException, IOException
  {
    fileByteStream = new FileInputStream(dataFile);
    scr = new Scanner(fileByteStream);
    i = 0;
     while (scr.hasNextLine())
     {
       holdWord = scr.nextLine();
       if(i == 0)
       {
        uniqueWords[i] = holdWord;
      }
       else
       {
         System.out.println("Running the else");
         int s = i;
         while(s > 0)
         {
           if(holdWord == uniqueWords[s - 1])
           {
             isSame = true;
           }
           s--;
         }

         if(isSame)
         {
           uniqueWords[i] = null;
           isSame = false;
         }
         else
         {
           uniqueWords[i] = holdWord;
         }
       }
       //uniqueWordsCheck[i] = holdWord;
       i++;
     }
     fileByteStream.close();
  }
//Create an instance method called write that takes a single parameter called outputFile (representing the path to a text file) and writes
//the words contained in uniqueWords to the file pointed to by outputFile. The output file should be overwritten if it already exists, and created if it does not exist.
  public void write(String outputFile) throws FileNotFoundException, IOException
  {
    fileOutStream = new FileOutputStream(outputFile);
    writer = new PrintWriter(fileOutStream);

    for(int k = 0; k < uniqueWords.length ; k++)
    {
      if(uniqueWords[k] == null)
      {
        continue;
      }
      else
      {
      writer.println(uniqueWords[k]);
      }
    }
    writer.flush();

    fileByteStream.close();
  }
}
