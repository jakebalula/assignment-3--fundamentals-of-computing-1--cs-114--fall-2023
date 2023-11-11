import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int row;
    int col;
    int currentValue = 1;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the size of your matrix");
    int size = scan.nextInt();
    System.out.println("Your matrix is " + size + " x " + size);

    System.out.println("Printing matrix:");
    int [][] table = new int [size] [size];
    for (row = 0; row < table.length; row++) {
      for (col = 0; col < table[row].length; col++) {
        System.out.print(table[row][col] + "\t");
      }
      System.out.println();
   }
    System.out.println();
    System.out.println("Populating matirx...");
    for (row = 0; row < table.length; row++) {
      for (col = 0; col < table[row].length; col++) {
        table[row][col] = currentValue++;
        System.out.print(table[row][col] + "\t");
      }
      System.out.println();
   }
    System.out.println();
    System.out.println("Flipping matrix:");
   scan.close();
  }
}
