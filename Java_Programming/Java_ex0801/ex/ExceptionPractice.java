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

    int[] intArray = {10, 25, 4, 67, 100};
    int index = 10;

    // 例外が発生する可能性がある処理をtryブロックで囲みます。
    try {
      System.out.println("指定された配列の要素：" + intArray[index]);
    }
    // 発生しうる例外クラスの型名と変数名を記述します。
    // 例外キャッチ時の処理を記述します。
    catch (ArrayIndexOutOfBoundsException e) {
      String message = e.getMessage();
      System.out.println("ArrayIndexOutOfBoundsException: " + message);
    }
    // 例外が発生してもしなくても、必ず実行する処理を記述します
    finally {
      System.out.println("プログラムを終了します");
    }
  }
}