// package java.s09;
public class MinTest {
  public static void main(String[] args) {

    System.out.print("入力された数値：");
    int[] arrNum = new int[args.length];
    for (int i = 0; i < arrNum.length; i++) {
      arrNum[i] = Integer.parseInt(args[i]);
      System.out.print(arrNum[i] + " ");
    }

    int min = arrNum[0];
    for (int i = 0; i < arrNum.length; i++) {
      if (arrNum[i] < min) {
        min = arrNum[i];
      }
    }

    System.out.println("\n配列中の最小値：" + min);
  }
}