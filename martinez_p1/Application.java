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
      DuplicateRemover dupRemove = new DuplicateRemover();
      File f = new File("unique_words.txt");
    //  File b = new File("problem1.txt");
      f.createNewFile();
      //fileCheck(f);
      //fileCheck(b);

      dupRemove.remove("problem1.txt");

      dupRemove.write("unique_words.txt");

    }



public static void print(String s)
    {
      System.out.print(s);
    }
public static void fileCheck(File f)
{
  if (f.exists())
  {
      System.out.println("File name: " + f.getName());
      System.out.println("Absolute path: " + f.getAbsolutePath());
      System.out.println("Writeable: " + f.canWrite());
      System.out.println("Readable " + f.canRead());
      System.out.println("File size in bytes " + f.length());
  }

  else
  {
    System.out.println("The file does not exist.");
  }
}
public static void println(String s)
    {
      System.out.println(s);
    }
}
