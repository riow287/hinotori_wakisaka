public class OutputIntArray {
  public static void main(String[] args) {
    int[] number = new int[100];

    for (int i = 0; i < number.length; i++) {
      number[i] = i;
    }

    for (int i = number.length - 1; i >= 0; i--) {
      System.out.print(number[i] + " ");
    }
  }
}
