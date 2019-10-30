import java.io.File;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;


public class DuplicateCounter
{
  //instance variable called wordCounter
  private static int wordCounter = 0;
  private static Scanner scr = null;
  private static FileInputStream fileByteStream = null;
  private static FileOutputStream fileOutStream = null;
  private static PrintWriter writer = null;
  //Create an instance method called count that takes a single parameter called dataFile
  //uses a Map of Strings to count how many times each word occurs in dataFile.
  public void count(String dataFile) throws FileNotFoundException, IOException
  {
    fileByteStream = new FileInputStream(dataFile);
    scr = new Scanner(fileByteStream);
  }
  //Create an instance method called write that takes a single parameter called outputFile
  //writes the contents of wordCounter to the file pointed to by outputFile.
  public void write(String outputFile) throws FileNotFoundException, IOException
  {
    fileOutStream = new FileOutputStream(outputFile);
    writer = new PrintWriter(fileOutStream);
  }
}
