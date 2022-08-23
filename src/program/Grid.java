package program;

import java.util.Random;

public class Grid {
  private Random random = new Random();
  private int[][] table;

  /* Creates a 2D array of integers with the specified number of rows and columns.
   * Fills the array with random numbers values of 0s and 1s.
   * Sets the value of the robot's starting position to 0. */
  public Grid(int row, int col) {
    table = new int[row][col];
    for (int x = 0; x < table.length; x++) {
      for (int y = 0; y < table[x].length; y++) {
        table[x][y] = random.nextInt(3) == 2 ? random.nextInt(2) : 0;
      }
    }
    table[0][0] = 0;
  }

  /* Creates a for loop that iterates through the array.
   * Creates a for loop that iterates through the array's inner array.
   * Checks if the cell is the robot's position.
   * Checks if the cell is an obstacle or not.
   * Prints the cell's contents. */
  public void viewGrid(Robot robot) {
    System.out.println("\n--------------------------------------------------\n");
    for (int i = 0; i < table.length; i++) {
      for (int j = 0; j < table[i].length; j++) {
        if (i == robot.posX() && j == robot.posY())
          System.out.print(robot.getDirection().getIcon());
        else
          System.out.print((table[i][j] == 0 ? "•" : "■") + " ");
      }
      System.out.println();
    }
    System.out.println("\n--------------------------------------------------\n");
    System.out.println("Press any commands to continue.");
  }

  public int[][] getGrid() {
    return table;
  }
}
