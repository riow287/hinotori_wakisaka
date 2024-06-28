public class RandomTest {
  public static void main(String[] args) {

    int count = Integer.parseInt(args[0]);

    for (int i = 1; i <= count; i++) {
      int random = (int)(Math.random() * 10);
      System.out.println(i + " ‰ñ–Ú:" + random);
    }
  }
}
