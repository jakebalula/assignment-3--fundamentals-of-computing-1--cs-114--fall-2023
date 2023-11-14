public class Matrix {
  int currentValue = 1;
  int size;
  int row;
  int col;
  int temp;
  private int [][] matrix = new int [size] [size];

  public Matrix (int size) { //Initialize matrix
    matrix = new int [size][size];
  }

  private void swap(int x1, int y1, int x2, int y2) { //Method to swap the numbers in matrix
    temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void printMatrix() { //Prints the matrix with no elements
    for (row = 0; row < matrix.length; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        if(col == matrix.length - row - 1)
        {
          System.out.print("\033[33m");
          System.out.printf("%d\t", matrix[row][col]);
          System.out.print("\u001b[0m");
        }
        else{
          System.out.print(matrix[row][col] + "\t");
        }
      }
      System.out.println();
   }
  }

  public void populateMatrix() { //Populates the matrix with numbers 1 - size*size
    for (row = 0; row < matrix.length; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = currentValue++;
      }
   }
  }

  public void flipMatrix () { //Flips the matrix
    for(row = 0; row < matrix.length / 2; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        if(col != matrix.length - row - 1) {
          swap(row, col, matrix.length - 1 - row, matrix.length-1 - col);
        }
      }
    }
  }
}
