public class IntArithmetic {
  public static void main(String[] args) {
    int num1 = 1234;
    int num2 = 333;

    // 掛け算
    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

    // 割り算
    System.out.println(num1 + "を" + num2 + "で割ると、");
    System.out.println("商は" + (num1 /num2) + "、余りは" + (num1 % num2) + "です。");
  }
}
