package views;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Scanner;

public class InputView {

  private static final String MESSAGE_FOR_ASKING_PLAYER_NAME = "플레이어 이름은(3 english letters)? : ";
  private static final String ERROR_MESSAGE_FOR_ILLEGAL_PLAYER_NAME = "사용자의 이름은 알파벳 3글자로 구성되어야 합니다.";
  private static final Scanner scanner = new Scanner(System.in);


  public static String askPlayerName() {
    System.out.printf("%s", MESSAGE_FOR_ASKING_PLAYER_NAME);

    String name = scanner.nextLine();
    validPlayerName(name);
    return name;
  }

  private static void validPlayerName(String name) {
    if (name.length() != 3) {
      throw new IllegalArgumentException(ERROR_MESSAGE_FOR_ILLEGAL_PLAYER_NAME);
    }
  }
}
