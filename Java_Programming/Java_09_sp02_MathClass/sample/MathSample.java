package sample;

/**
 * Mathクラスを使ったサンプルです
 * @author emBex Education
 */
public class MathSample {

  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {

    /* 定数を利用する*/
    System.out.println("円周率：" + Math.PI);

    /* staticメソッドを利用する*/
    int value1 = 2;
    int value2 = 3;

    System.out.println("2つの値のうち大きい方：" + Math.max(value1, value2));
    System.out.println("2つの値のうち小さい方：" + Math.min(value1, value2));
    System.out.println("2つの値の積：" + Math.multiplyExact(value1, value2));

    int randomValue = (int)(Math.random() * 10);
    System.out.println("0-9の範囲のランダム値：" + randomValue);
  }
}