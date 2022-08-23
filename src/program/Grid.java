package program;

import java.util.Random;

public class Grid {
  private Random random = new Random();
  int[][] table;

  /* Creates a 2D array of integers with the specified number of rows and columns.
   * Fills the array with random numbers values of 0s and 1s.
   * Sets the value of the robot's starting position to 0. */
  public Grid(int rows, int cols) {
    table = new int[rows][cols];
    for (int x = 0; x < table.length; x++) {
      for (int y = 0; y < table[x].length; y++) {
        int nextCell = random.nextInt(3) == 2 ? random.nextInt(2) : 0;
        table[x][y] = nextCell == 0 ? 0 : 1;
      }
    }
    table[0][0] = 0;
  }

  /* Creates a for loop that iterates through the array.
   * Creates a for loop that iterates through the array's inner array.
   * Prints the cell's contents. */
  public void viewGrid(Robot robot) {
    System.out.println("\n--------------------------------------------------\n");
    for (int x = 0; x < table.length; x++) {
      for (int y = 0; y < table[x].length; y++) {
        printCell(robot, x, y);
      }
      System.out.println();
    }
    System.out.println("\n--------------------------------------------------\n");
  }

  /* Checks if the cell is the robot's position.
   * Checks if the cell is an obstacle or not.
   * Prints the cell's contents. */
  private void printCell(Robot robot, int x, int y) {
    if (x == robot.getPosition()[0] && y == robot.getPosition()[1]) {
      if (robot.getDirection().matches("NORTH"))
        System.out.print("ᐱ ");
      if (robot.getDirection().matches("WEST"))
        System.out.print("ᐸ ");
      if (robot.getDirection().matches("SOUTH"))
        System.out.print("ᐯ ");
      if (robot.getDirection().matches("EAST"))
        System.out.print("ᐳ ");
    } else {
      System.out.print((table[x][y] == 0 ? "•" : "■") + " ");
    }
  }
}
