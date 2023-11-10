import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int row;
    int col;
  {
    int [][] table = new int [5] [10];

    for (row = 0; row < table.length; row++)
      for (col = 0; col < table[row].length; col++)
        table[row][col] = row * 10 + col;

    for (row = 0; row < table.length; row++)
    {
      for (col = 0; col < table[row].length; col++)
        System.out.print(table[row][col] + "\t");
      System.out.println();
    }
  }
  }
}
