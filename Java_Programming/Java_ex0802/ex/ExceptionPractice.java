package ex;
/**
 * 例外処理の練習のためのクラスです。
 * @author emBex Education
 */
public class ExceptionPractice {
  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    
    String str = "ABC";

    // ※仮に、変数str の値が 「3」 だった場合
    // String str = "3";

    try {
      int value = Integer.parseInt(str);
      System.out.println("value の二乗:" + (value * value));

    } catch (NumberFormatException e) {
      String message = e.getMessage();
      System.out.println("java.lang.NumberFormatException: " + message);

    } finally {
      System.out.println("プログラムを終了します");
    }
  }
}