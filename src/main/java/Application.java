import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    System.out.println("main");

    System.out.print("플레이어 이름은(3 english letters)?: ");

    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("name : " + name);
  }
}
