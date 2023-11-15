public class Matrix {
  int currentValue = 1;
  int size;
  int row;
  int col;
  int temp;
  private int [][] matrix = new int [size] [size];

  public Matrix (int size) {
    matrix = new int [size][size];
  }

  private void swap(int x1, int y1, int x2, int y2) {
    temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void printMatrix() {
    for (row = 0; row < matrix.length; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        if(col == matrix.length - row - 1)
        {
          System.out.print("\033[33m"); //Sets diagonal color to yellow
          System.out.printf("%d\t", matrix[row][col]);
          System.out.print("\u001b[0m"); //Switches the color back to default
        }
        else{
          System.out.print(matrix[row][col] + "\t");
        }
      }
      System.out.println();
   }
  }

  public void populateMatrix() {
    for (row = 0; row < matrix.length; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = currentValue++; //Fills the matrix starting from 1
      }
    }
  }

  public void flipMatrix () {
    for(row = 0; row < matrix.length / 2; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        if(col != matrix.length - row - 1) {
          swap(row, col, matrix.length - 1 - row, matrix.length-1 - col); //Algorithm to swap values except for the diagonal
        }
      }
    }
  }
}
