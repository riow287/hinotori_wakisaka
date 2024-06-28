import java.util.Scanner;

public class Sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("数字を5つ入力してください。\n");

    int[] arrNum = new int[5];

    for (int i = 0; i < 5; i++) {
      String str = sc.next();
      int num = Integer.parseInt(str);
      arrNum[i] = num;
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    int idx = 0; // numのインデックス

    while (idx < 5) { // 最高で5回に分けて入力できる

      String str = sc.nextLine(); // 改行コードまでの値を読み取る
      String[] arrStr =
          str.split(" "); // String型変数名.split(区切り文字,分割回数);

      for (String numStr : arrStr) {
        if (idx < 5) {
          int num = Integer.parseInt(numStr);
          arrNum[idx] = num;
          idx++;
        }
        if (idx == 5) {
          break;
        }
      }
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

  // バブルソート
  for (int i = 0; i < arrNum.length - 1; i++) {
    for (int j = 0; j < arrNum.length - 1 - i; j++) {
      if (arrNum[j] > arrNum[j + 1]) {
        int temp = arrNum[j];
        arrNum[j] = arrNum[j + 1];
        arrNum[j + 1] = temp;
      }
    }
  }

  System.out.println();
  System.out.println("並び替え後");
  for (int i = 0; i < arrNum.length; i++) {
    System.out.print(arrNum[i] + " ");
    // for (int num : arrNum) {
    //   System.out.print(num + " ");
    // }
  }
}
}
// バブルソート

// スペースで区切られてるとこ　ばらす　「java splitメソッド」