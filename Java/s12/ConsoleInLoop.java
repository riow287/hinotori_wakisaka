import java.util.Scanner;

public class ConsoleInLoop {
  public static void main(String[] args) {

    String str = null;
    int loop = 0;

    Scanner sc = new Scanner(System.in);

    while (loop == 0) {
      System.out.print("���������͂��Ă�������: ");
      str = sc.nextLine();

      if (str.equals("quit")) {
        System.out.println("�v���O�������I�����܂�");
        loop = 1;
        // break;
      } else {
        System.out.println("���͂��ꂽ�l�́A�w" + str + "�x�ł��B");
      }
    }

    sc.close();
  }
}
