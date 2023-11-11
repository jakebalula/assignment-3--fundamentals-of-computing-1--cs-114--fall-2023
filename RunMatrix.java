import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int row;
    int col;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the size of your matrix");
    int size = input.nextInt();
    System.out.println("Your matrix is " + size + " x " + size);
  {
    int [][] table = new int [size] [size];

    // for (row = 0; row < table.length; row++)
    //   for (col = 0; col < table[row].length; col++)
    //     table[row][col] = row * 10 + col;

    for (row = 0; row < table.length; row++)
    {
      for (col = 0; col < table[row].length; col++)
        System.out.print(table[row][col] + "\t");
      System.out.println();
    }
  }
  }
}
