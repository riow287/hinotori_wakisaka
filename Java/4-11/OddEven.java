public class OddEven {
  public static void main(String[] args) {
    int val = 10;

    if (val > 0) {
      if ((val % 2) == 0) {
        System.out.println(val + " �͋����ł��B");
      } else {
        System.out.println(val + " �͊�ł��B");
      }
    } else {
      System.out.println("0 ���傫���l��ݒ肵�Ă��������B");
    }
  }
}
