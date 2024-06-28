package ex;
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
    byte num1 = 8;
    byte num2 = 5;

    try {
      byte result = add(num1, num2);
      System.out.println("計算結果：" + result);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("プログラムを終了します");
    }
  }

  /**
   * 二つのbyte 型整数の合計を返します。
   * 結果がbyte の範囲を超える場合、例外をスローします。
   * @param num1 一つ目の値
   * @param num2 二つ目の値
   * @return 二つのbyte 型整数の合計値
   * @throws ArithmeticException 結果がbyte の範囲を超える場合。
   * （詳細メッセージは「計算結果がbyte の範囲を超えています」）
   */
  static byte add(byte num1, byte num2) {
    int result = num1 + num2;
    if (result < -128 || 127 < result) {
      String errMsg = "計算結果がbyteの範囲を超えています";
      ArithmeticException iae = new ArithmeticException(errMsg);
      throw iae;
    }
    return (byte)result;
  }
}