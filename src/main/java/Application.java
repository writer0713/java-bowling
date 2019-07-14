import views.InputView;

public class Application {

  public static void main(String[] args) {

    String name =InputView.askPlayerName();

    System.out.println("name : " + name);
  }
}
