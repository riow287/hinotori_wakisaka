
import java.util.Scanner;

public class Arithmetic1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1つ目の整数：");
    int num1 = sc.nextInt();

    System.out.print("2つ目の整数：");
    int num2 = sc.nextInt();

    sc.close();

    int sum = multiply(num1, num2);

    System.out.println("乗算結果：" + sum);
  }

  public static int multiply(int num1, int num2) {
    int sum;
    sum = num1 * num2;
    return sum;
  }
}
