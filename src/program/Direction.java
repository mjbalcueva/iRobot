package program;

enum Direction {
  NORTH(-1, 0, "ᐱ "), EAST(0, 1, "ᐳ "), SOUTH(1, 0, "ᐯ "), WEST(0, -1, "ᐸ ");

  private final int dirX;
  private final int dirY;
  private final String icon;

  private Direction(int x, int y, String icon) {
    dirX = x;
    dirY = y;
    this.icon = icon;
  }

  public int getX() {
    return dirX;
  }

  public int getY() {
    return dirY;
  }

  public String getIcon() {
    return icon;
  }
}
