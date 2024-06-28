package ex;

/**
 * Stringクラスを使った
 * @author name
 */
public class StringPractice {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    String str = "Welcome to Java World!";
    String strArgs = args[0];

    int index = str.indexOf(strArgs);

    if (index != -1) {
      System.out.println("検索文字列『" + strArgs +
                         "』が、文字列のインデックス番号" + index +
                         "に見つかりました。");
    } else {
      System.out.println("検索文字列『" + strArgs +
                         "』が、文字列に見つかりませんでした。");
    }
  }
}