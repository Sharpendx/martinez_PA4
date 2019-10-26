/*
Create a utility class called DuplicateRemover.
Create an instance method called remove that takes a single parameter called dataFile (representing the path to a text file) and uses a
Set of Strings to eliminate duplicate words from dataFile.
The unique words should be stored in an instance variable called uniqueWords.
Create an instance method called write that takes a single parameter called outputFile (representing the path to a text file) and writes
the words contained in uniqueWords to the file pointed to by outputFile. The output file should be overwritten if it already exists, and created if it does not exist.

Create a separate class called Application that contains a main method which illustrates the use of DuplicateRemover
by calling both the remove and write methods. Your input file must be called problem1.txt and your output file must be called unique_words.txt.

*/
import java.io.File;
import java.util.Arrays;

public class DuplicateRemover
{
  private static String[] uniqueWords = new String[100];
  private static String holdWord;

  public static String getUniqueWords(int address)
  {
    return uniqueWords[address];
  }
  public static void remove(File dataFile)
  {
    System.out.print("It worked?");
  }

  public static void write(File outputFile)
  {

  }
}
