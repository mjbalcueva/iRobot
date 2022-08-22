package program;

import java.util.Scanner;

public class App {
  Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("\nWelcome to iRobot!");
    App program = new App();
    program.generateNewMap();
  }

  private void generateNewMap() {
    System.out.println("\nGenerating map...");
    System.out.print("Rows: ");
    int rows = console.nextInt();
    System.out.print("Cols: ");
    int cols = console.nextInt();
    console.nextLine();
    System.out.println("\n--------------------------------------------------\n");

    Grid map = new Grid(rows, cols);
    Robot iRobot = new Robot(map);

    System.out.println("iRobot is starting its journey facing " + iRobot.getDirection() + ".");
    System.out.println("Press any commands to continue.");

    getDecision(iRobot, map);
  }

  private void getDecision(Robot robot, Grid map) {
    System.out.print("↳ ");
    String action = console.nextLine().trim().toUpperCase();

    if (action.matches("W"))
      robot.changeDirection("W");
    else if (action.matches("A"))
      robot.changeDirection("A");
    else if (action.matches("S"))
      robot.changeDirection("S");
    else if (action.matches("D"))
      robot.changeDirection("D");
    else if (action.matches(""))
      robot.travel();
    else if (action.matches("\\d+"))
      robot.travel(Integer.parseInt(action));
    else if (action.matches("H"))
      showHelp();
    else if (action.matches("M"))
      map.viewGrid(robot);
    else if (action.matches("R"))
      generateNewMap();
    else if (action.matches("X"))
      exit();
    else
      System.out.println("Command not found");

    getDecision(robot, map);
  }

  private void showHelp() {
    System.out.println("\n--------------------------------------------------");
    System.out.println("Controls:");
    System.out.println("  W - Face North");
    System.out.println("  A - Face West");
    System.out.println("  S - Face South");
    System.out.println("  D - Face East");
    System.out.println("\nDefault orrientation: East");
    System.out.println("  [enter]  - Move 1 square the current direction");
    System.out.println("  [number] - Move n square the current direction");
    System.out.println("\nNote:");
    System.out.println("  H - Show Help");
    System.out.println("  M - Show Map");
    System.out.println("  R - Generate new map");
    System.out.println("  X - Exit program");
    System.out.println("--------------------------------------------------\n");
  }

  private void exit() {
    System.out.println("iRobot has ended its journey.");
    System.exit(0);
  }
}
