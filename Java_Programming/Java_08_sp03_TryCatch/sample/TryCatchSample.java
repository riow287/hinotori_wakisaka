package sample;

/**
 * try-catch構文のサンプルクラスです。
 * @author
 */
public class TryCatchSample {
  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {
    try {                               // 例外が発生する可能性がある処理
      int result = 1000 / 0;
      System.out.println(result);

    } catch (ArithmeticException e) {
      System.out.println("catchブロックを実行します。");
      String message = e.getMessage();  // 例外キャッチ時の処理
      System.out.println(message);
    
    } finally {                         // 必ず実行する処理
      System.out.println("finallyブロックを実行します。");
    
    }
    System.out.println("try-catch構文を抜けました。");
  }
}