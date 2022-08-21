package program;

enum Direction {
  NORTH(-1, 0), EAST(0, 1), SOUTH(1, 0), WEST(0, -1);

  private final int dirX;
  private final int dirY;

  private Direction(int x, int y) {
    dirX = x;
    dirY = y;
  }

  public int getX() {
    return dirX;
  }

  public int getY() {
    return dirY;
  }
}
