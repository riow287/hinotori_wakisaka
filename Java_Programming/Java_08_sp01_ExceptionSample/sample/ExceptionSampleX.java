package sample;

/**
 * 例外発生によりプログラムが強制終了する様子を示したサンプルプログラムです。
 * @author emBex Education
 */
public class ExceptionSampleX {
  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {
    // ExceptionSampleYクラスのmethodYメソッドを呼び出します。
    ExceptionSampleY.methodY();
    System.out.println("メインメソッドの終端まで実行しました。");
  }
}