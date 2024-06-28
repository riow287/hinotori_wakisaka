package ex;

import java.util.Scanner;

/**
 * Scannerクラスを使ってキーボードから入力された文字列をコンソールに出力する
 * 「quit」が入力されたら終了する
 * @author name
 */
public class ScanPractice {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    String str = null;
    // int loop = 0;

    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        System.out.print("文字列を入力してください: ");
        str = sc.nextLine();

        if (str.equals("quit")) {
          System.out.println("プログラムを終了します");
          break;
        } else {
          System.out.println("入力された値は、『" + str + "』です。");
        }
      }
    }
    
  }
}
