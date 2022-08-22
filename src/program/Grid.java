package program;

import java.util.Random;

public class Grid {
  private Random random = new Random();
  int[][] table;

  /* 
  * Create a new 2D array of integers.
  * Create a new Random object.
  * Initialize the array
  * with random values of 0s and 1s.
  * Set the initial position to 0.
  */
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

  /*
   * Declars a 2D array of cells
   * Creates a loop that iterates through the array
   * Creates a loop that iterates through the array's inner array
   * Prints the cell's contents.
   */
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

  /*
   * Prints the table with the robot's position marked with an:
   * "ᐱ" for NORTH, "ᐸ" for WEST, "ᐯ" for SOUTH, and "ᐳ" for EAST.
   * Prints the table with the robot's position marked with an "•" for empty,
   * and "■" for occupied.
   */
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
