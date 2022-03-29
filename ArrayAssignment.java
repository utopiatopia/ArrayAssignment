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
        x = inputFile.nextLine().split(" \t");
        schoolData.changeArray(x[0], 1);
        schoolData.changeArray(x[1], 2);
        schoolData.changeArray(x[2], 4);
      }
      schoolData.printArray();
      inputFile.reset();
      
      // ArrayData
    } catch (Exception e) {
      System.out.print("ERROR: ");
      e.printStackTrace();
    }
    
  }
}