
import java.util.Scanner;

public class Arithmetic1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1�ڂ̐����F");
    int num1 = sc.nextInt();

    System.out.print("2�ڂ̐����F");
    int num2 = sc.nextInt();

    sc.close();

    int sum = multiply(num1, num2);

    System.out.println("��Z���ʁF" + sum);
  }

  public static int multiply(int num1, int num2) {
    int sum;
    sum = num1 * num2;
    return sum;
  }
}
