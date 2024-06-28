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

    String[] fruits = {"orange", "banana", "lemon", "apple", "peach"};

    String str = args[0];

    boolean bFound = false;
    int index = 0;
    for (int i = 0; i < fruits.length; i++) {
      if (fruits[i].equals(str)) {
        bFound = true;
        index = i;
      }
    }
    if (bFound == true) {
      System.out.println("検索文字列『" + str + "』が、配列のインデックス番号" +
                         index + "に見つかりました。");
    } else {
      System.out.println("検索文字列『" + str +
                         "』が、配列中に見つかりませんでした。");
    }
  }
}
