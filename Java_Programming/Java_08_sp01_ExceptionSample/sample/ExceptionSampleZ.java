package sample;
/**
 * 例外発生によりプログラムが強制終了する様子を示したサンプルプログラムです。
 * @author emBex Education
 */
public class ExceptionSampleZ {
  /**
   * String型配列を生成し、その要素を繰返し表示します。
   */
  public static void methodZ() {
    String[] strAry = {"abc", "def", "ghi"};
    for (int i = 0; i <= strAry.length; i++) {
      System.out.println(strAry[i]);
    }
    System.out.println("Zメソッドの終端まで実行しました。");
  }
}