package program;

import java.util.Random;

public class Grid {
  private Random random = new Random();
  int[][] table;

  // Creates a 2D array of random 0s and 1s.
  public Grid(int rows, int cols) {
    table = new int[rows][cols];
    for (int x = 0; x < table.length; x++) {
      for (int y = 0; y < table[x].length; y++) {
        int nextCell = random.nextInt(3) == 2 ? random.nextInt(2) : 0;
        table[x][y] = nextCell == 0 ? 0 : 1;
      }
    }
    table[0][0] = 0; // always set valid initial position
  }

  /**
   * It prints the grid with the robot's position marked with an 'R' and the dirt marked with an 'X'
   * 
   * @param robot The robot object
   */
  void viewGrid(Robot robot) {
    System.out.println("\n--------------------------------------------------\n");
    for (int x = 0; x < table.length; x++) {
      for (int y = 0; y < table[x].length; y++) {
        printCell(robot, x, y);
      }
      System.out.println();
    }
    System.out.println("\n--------------------------------------------------\n");
  }

  /**
   * If the robot is at the current cell, print the robot's direction, otherwise print a dot or a
   * block depending on the value of the cell
   * 
   * @param robot The robot object
   * @param x the x coordinate of the cell
   * @param y the y coordinate of the robot
   */
  private void printCell(Robot robot, int x, int y) {
    if (x == robot.position[0] && y == robot.position[1]) {
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
