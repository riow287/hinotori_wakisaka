public class TimesTable {
  public static void main(String[] args) {

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        int val = i * j;
        System.out.printf("%02d ", val);
      }
      System.out.println("\n");
    }
  }
}