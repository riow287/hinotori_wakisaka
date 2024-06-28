package ex;

import java.util.Random;

/**
 * Mathクラスを使用し、
 * 1～100の範囲のランダム値を10個生成して表示する
 * @author name
 */

public class MathPractice {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    System.out.println("1～100の範囲のランダム値を10個表示します。");

    /*
     * RandomクラスのnextIntメソッドを使った乱数生成
     * 0から、引数で指定された値の範囲の乱数が生成される
     * (0は含むが、その指定された値は含まない)
     */
    Random random = new Random();
    for (int i = 1; i <= 10; i++) {
      int randomValue = random.nextInt(100) + 1;
      System.out.println(i + "個目：" + randomValue);
    }
  }
}