public class NumberLoop2 {
  public static void main(String[] args) {
    int val = 1;
    while (val <= 100) {
      if ((val % 2 == 1) && (val % 7 == 0)) {
        System.out.print(val + " ");
      }
      val ++;
    }
  }
}
