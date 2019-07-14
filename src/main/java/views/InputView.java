package views;

import java.util.Scanner;

public class InputView {

  private static final String MESSAGE_FOR_PLAYER_NAME = "플레이어 이름은(3 english letters)? : ";
  private static final Scanner scanner = new Scanner(System.in);


  public static String askPlayerName() {
    System.out.printf("%s", MESSAGE_FOR_PLAYER_NAME);

    String name = scanner.nextLine();
    return name;
  }
}
