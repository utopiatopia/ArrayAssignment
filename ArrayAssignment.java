import java.io.File;
import java.util.Scanner;

public class ArrayAssignment {
  public static void main(String[] args) {
    try {
      File schoolFile = new File("schools.txt");
      Scanner inputFile = new Scanner(schoolFile);
      ArrayData schoolData = new ArrayData();
      String[] x;
      while (inputFile.hasNextLine()) {
        x = inputFile.nextLine().split();
        x = input
      }
      inputFile.reset();
      
      ArrayData schoolData = new ArrayData();
      // ArrayData
    } catch (Exception e) {
      System.out.println("ERROR: " + e);
    }
    
  }
}