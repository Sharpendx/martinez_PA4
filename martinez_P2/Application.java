//Create a separate class called Application that contains a main method which illustrates the use of DuplicateCounter
//by calling both the remove and write methods. Your input file must be called problem2.txt and your output file must be called unique_word_counts.txt.
import java.io.*;
import java.util.*;
import java.io.File;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class Application
{
  public static void main (String[] args) throws IOException
    {
      DuplicateCounter dupCounter = new DuplicateCounter();

      File f = new File("unique_word_counts.txt");

      f.createNewFile();

      dupCounter.count("problem2.txt");

      dupCounter.write("unique_word_counts.txt");
    }
}
