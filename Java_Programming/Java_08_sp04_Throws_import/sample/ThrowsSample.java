package sample;

// import java.io.IOException;
// 「9.5 import宣言」

/**
 * throws宣言のサンプルクラスです。
 * @author emBex Education
 */
public class ThrowsSample {

  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {
    try {
      outputCharCode();
    } catch (java.io.IOException e) {
      System.out.println(e);
    }
  }

  /**
   * 文字の入力を受け付け、その文字の文字コードを出力するメソッドです。
   * @throws IOException 入出力エラーが発生した場合。
   */
  static void outputCharCode() throws java.io.IOException {
    System.out.print("文字を1文字入力してください：");
    int charCode = 0;
    charCode = System.in.read();
    System.out.println("文字コードは、" + charCode + "です");
  }
}