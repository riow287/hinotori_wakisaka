import java.util.Scanner;
public class SearchNumber {
  public static void main(String[] args) {
    int[] num = {2, 3, 5, 7, 11, 13, 17, 19};
    boolean found = false;
    Scanner sc = new Scanner(System.in);
    System.out.print("調べる数値：");
    int val = sc.nextInt();
    sc.close();

    for (int i = 0; i < num.length; i++) {
      if (num[i] == val) {
        found = true;
      }
    }

    if (found) {
      System.out.println(val + "が見つかりました。");
    } else {
      System.out.println(val + "は見つかりませんでした。");
    }
  }
}

