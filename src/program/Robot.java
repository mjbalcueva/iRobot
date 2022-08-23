package program;

class Robot {
  private Direction direction = Direction.EAST;
  private int[][] map;
  private int[] position = {0, 0};

  Robot(Grid map) {
    this.map = map.getGrid();
  }

  /* Checks if the next cell is out of bounds. If so, the iRobot has hit a wall.
   * Checks if the content of the next cell = 1. If so, the iRobot has hit an obstacle.
   * If the next cell is not out of bounds and not an obstacle, iRobot moves there.*/
  public boolean travel() {
    int x = position[0];
    int y = position[1];
    int rows = map.length - 1;
    int cols = map[0].length - 1;

    int newX = x += direction.getX();
    int newY = y += direction.getY();
    boolean outOfBounds = (x < 0 || y < 0 || x > rows || y > cols);

    if (outOfBounds || map[x][y] != 0) {
      String errorMessage = outOfBounds ? "iRobot has hit a wall." : "iRobot has hit an obstacle.";
      System.out.println(errorMessage + " Change direction.");
      return false;
    } else {
      position = new int[] {newX, newY};
      System.out.println("iRobot moved to: " + newX + ", " + newY);
      return true;
    }
  }

  /* Prints a new line before the method call.
   * Creates a method call that runs n times.
   * While the iRobot is not out of bounds and not hitting an obstacle, it moves.*/
  public void travel(int n) {
    System.out.println();
    for (int i = 0; i < n; i++) {
      if (!travel())
        break;
    }
  }

  /* Checks if the input direction is W, A, S, or D.
   * Changes the direction to the inputted new direction.
   * Prints out an updated direction.*/
  public void setDirection(String newDirection) {
    if (newDirection.matches("W"))
      direction = Direction.NORTH;
    if (newDirection.matches("A"))
      direction = Direction.WEST;
    if (newDirection.matches("S"))
      direction = Direction.SOUTH;
    if (newDirection.matches("D"))
      direction = Direction.EAST;
    System.out.println("\niRobot has faced " + direction);
  }

  public Direction getDirection() {
    return direction;
  }

  public int posX() {
    return position[0];
  }

  public int posY() {
    return position[1];
  }
}
