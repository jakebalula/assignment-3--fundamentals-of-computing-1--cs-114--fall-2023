import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the size of your matrix");
    size = scan.nextInt();
    System.out.println("Your matrix is " + size + " x " + size);

    Matrix matrix = new Matrix(size);

    System.out.println("Printing matrix:");
    matrix.printMatrix();
    System.out.println();

    System.out.println("Populating matirx...");
    matrix.populateMatrix();
    System.out.println();

    System.out.println("Flipping matrix...");
    matrix.flipMatrix();

   scan.close();
  }
}
