package java.s01;
import java.util.Scanner;
public class IntSum {

  public static int sumLoop(int min, int max) {
    int sum = 0;
    for (int i = min; i <= max; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("�ŏ��l�F");
    int min = sc.nextInt();

    System.out.print("�ő�l�F");
    int max = sc.nextInt();

    sc.close();

    int result = sumLoop(min, max);

    System.out.println("���Z���ʁF" + result);
  }
}
