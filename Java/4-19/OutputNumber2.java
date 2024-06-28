import java.util.Scanner;

public class OutputNumber2 {
  public static void main(String[] args) {
    int[] num = {5, 9, 1, 4, 8, 2, 7, 6, 3, 0};

    Scanner sc = new Scanner(System.in);
    System.out.print("数値：");
    int val = sc.nextInt();
    sc.close();

    System.out.print(val + "以上の要素：");

    for (int number : num) {
      if (number >= val) {
        System.out.print(number + " ");
      }
    }
  }
}
