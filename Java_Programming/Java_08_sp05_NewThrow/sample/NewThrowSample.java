package sample;

/**
 * 例外クラスを任意に生成するサンプルクラスです。
 * @author emBex Education
 */
public class NewThrowSample {

  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {
    String result = judge(99);      // サンプル：101
    System.out.println("結果:" + result);
  }

  /**
   * テストの点数に応じた判定を返す
   * @param score テストの点数（0～100）
   * @return 判定結果
   * @throws IllegalArgumentException 引数が0～100の範囲外だった場合
   */
  static String judge(int score) {
    String result;
    if (0 <= score && score <= 100) {
      if (score >= 80) {
        result = "A判定";
      } else if (score >= 60) {
        result = "B判定";
      } else {
        result = "C判定";
      }
    } else {
      String errMsg = "不正な引数：点数は0～100の範囲で指定してください。";
      IllegalArgumentException iae = new IllegalArgumentException(errMsg);
      throw iae;
    }
    return result;
  }
}