
import java.util.Scanner;

public class Arithmetic1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1‚Â–Ú‚Ì®”F");
    int num1 = sc.nextInt();

    System.out.print("2‚Â–Ú‚Ì®”F");
    int num2 = sc.nextInt();

    sc.close();

    int sum = multiply(num1, num2);

    System.out.println("æZŒ‹‰ÊF" + sum);
  }

  public static int multiply(int num1, int num2) {
    int sum;
    sum = num1 * num2;
    return sum;
  }
}
