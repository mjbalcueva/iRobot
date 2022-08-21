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
    table[0][0] = 0;
  }

  // It loops through the position array and prints out each of its element
  void viewGrid() {
    System.out.println("\n--------------------------------------------------\n");
    for (int[] rows : table) {
      for (int cols : rows) {
        System.out.print(cols + " ");
      }
      System.out.println();
    }
    System.out.println("\n--------------------------------------------------\n");
  }
}
