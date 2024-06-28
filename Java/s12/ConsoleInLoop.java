import java.util.Scanner;

public class ConsoleInLoop {
  public static void main(String[] args) {

    String str = null;
    int loop = 0;

    Scanner sc = new Scanner(System.in);

    while (loop == 0) {
      System.out.print("文字列を入力してください: ");
      str = sc.nextLine();

      if (str.equals("quit")) {
        System.out.println("プログラムを終了します");
        loop = 1;
        // break;
      } else {
        System.out.println("入力された値は、『" + str + "』です。");
      }
    }

    sc.close();
  }
}
