package sample;
/**
 * 例外発生によりプログラムが強制終了する様子を示したサンプルプログラムです。
 * @author emBex Education
 */
public class ExceptionSampleY {
  /**
   * （メソッド内部でExceptionSampleZクラスのmethodZメソッドを呼び出します。）
   */
  public static void methodY() {
    ExceptionSampleZ.methodZ();
    System.out.println("Yメソッドの終端まで実行しました。");
  }
}