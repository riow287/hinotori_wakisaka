public class MaxValue {
  public static void main(String[] args) {
    int[] num = {3, 19, 25, 12, 22, 9, 5, 15, 7, 12};

    int max = num[0];

    for (int i = 0; i < num.length; i++) {
      if (num[i] > max) {
        max = num[i];
      }
    }

    System.out.println("Å‘å’lF" + max);
  }
}
