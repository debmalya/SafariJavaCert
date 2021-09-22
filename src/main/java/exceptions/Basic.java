package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class Basic {

  public static void showFile(String fn) throws FileNotFoundException, IOException {
// HORRIBLE!!!
//    FileReader fr = null;
//    try {
////      FileReader fr = new FileReader(fn);
//      fr = new FileReader(fn);
//      FileWriter fw = new FileWriter("out" + fn);
//    } finally {
//      if (fr != null) {
//        fr.close(); // might also need try/catch!!
//      }
    // "resources" MUST implement AutoCloseable
    try (FileReader fr = new FileReader(fn);
         FileWriter fw = new FileWriter("out" + fn);) {

    } // auto-generated finally which closes properly everything that can be closed
    // in reverse order of the opening :)
    // if a close throws an exception, any original exception is STILL THROWN to the caller
    // it gets a list of "suppressed" exceptions for any closure failure

//  public static void showFile(String fn) throws FileNotFoundException, SQLException {
////  public static void showFile(String fn) throws IOException {
//    FileReader fr = new FileReader(fn);
  }

  public static void main(String[] args) {
    try {
      showFile("data.txt");
    } catch (FileNotFoundException fnfe) {

    } catch (IOException ioe) {
      System.out.println("the file was not found");
//    } catch (SQLException ioe) {

    } finally {
      System.out.println("'Always' executed");
//      return;
    }
  }

}
