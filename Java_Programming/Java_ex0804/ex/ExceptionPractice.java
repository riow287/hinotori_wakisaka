package ex;

import java.io.IOException;

/**
 * 例外処理の練習のためのクラスです。
 * @author emBex Education
 */
public class ExceptionPractice {

  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {

    try {
      outputChar();
    } catch (IOException e) {
      System.out.println("入出力エラーが発生しました。");
    } finally {
      System.out.println("プログラムを終了します");
    }
  }

  /**
   * 文字の入力を受け付け、その文字の文字コードを出力するメソッドです。
   * @throws IOException 入出力エラーが発生した場合。
   */
  static void outputChar() throws IOException {
    
    // throw new IOException(); // テスト用コード
    
    System.out.print("文字を1 文字入力してください：");

    int charCode = 0;
    charCode = System.in.read();

    System.out.println("文字コードは、" + charCode + "です");
  }
}