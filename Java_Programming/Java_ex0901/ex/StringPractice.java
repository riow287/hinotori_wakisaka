package ex;

/**
 * Stringクラスを使って二つの文字列が等しいかどうかを判定する
 * @author name
 */
public class StringPractice {

  /**
   * メインメソッド
   * @param args コマンドライン引数（2つ）
   */
  public static void main(String[] args) {

    String str1 = args[0];
    String str2 = args[1];

    System.out.println("一つ目の文字列：" + str1);
    System.out.println("二つ目の文字列：" + str2);

    if (str1.equals(str2)) {
      System.out.println("二つの文字列は等しい。");
    } else {
      System.out.println("二つの文字列は等しくない。");
    }
  }
}
