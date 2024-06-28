public class OddEven {
  public static void main(String[] args) {
    int val = 10;

    if (val > 0) {
      if ((val % 2) == 0) {
        System.out.println(val + " は偶数です。");
      } else {
        System.out.println(val + " は奇数です。");
      }
    } else {
      System.out.println("0 より大きい値を設定してください。");
    }
  }
}
