public class FizzBuzz {
  public static void main(String[] args) {

    int max;
    max = Integer.parseInt(args[0]);

    for (int i = 1; i <= max; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.print("FizzBuzz ");
      } else if (i % 3 == 0) {
        System.out.print("Fizz ");
      } else if (i % 5 == 0) {
        System.out.print("Buzz ");
      } else {
        System.out.print(i + " ");
      }
    }
  }
}
