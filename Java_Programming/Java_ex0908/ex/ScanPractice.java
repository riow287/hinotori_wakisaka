package ex;

import java.util.Scanner;

/**
 * Scannerクラスを使ってキーボード入力された値を出力する
 * @author name
 */
public class ScanPractice {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    String str = null;

    // Scannerクラスのオブジェクトを生成
    Scanner sc = new Scanner(System.in);

    System.out.print("名前を入力してください：");

    // キーボードから入力した値をString型変数strに代入
    str = sc.next();

    System.out.println(str + "さん、こんにちは。");
  }
}
