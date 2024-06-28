package sample;

/**
 * Stringクラスを使った文字列操作のサンプルです
 * @author emBex Education
 */
public class StringSample {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    String str1 = "pineapple";
    String str2 = "watermelon";
    
    System.out.println("■操作対象の文字列：" + str1);
    System.out.println("文字数：" + str1.length());
    System.out.println("インデックスが3の文字：" + str1.charAt(3));
    System.out.println("pの最初の出現位置：" + str1.indexOf("p"));
    System.out.println("cが含まれるかどうか：" + str1.contains("c"));
    System.out.println("pをqに置換：" + str1.replace("p", "q"));
    
    System.out.println();
    
    System.out.println("■操作対象の文字列：" + str1 + ", " + str2);
    System.out.println("2つの値が等しいかどうか：" + str1.equals(str2));
  }
}