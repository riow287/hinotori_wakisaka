package sample;
/**
 * ラッパークラスの利用方法のサンプルです。
 * @author emBex Education
 */
public class WrapperSample {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    /* 基本データ型から参照型へ変換*/
    Integer object = Integer.valueOf(100);
    
    /* 参照型から基本データ型へ変換*/
    int primitive = object.intValue();
    System.out.println(primitive);
    
    /* 基本データ型から参照型へ変換(Boxing) */
    Integer boxingInt = 300;
    
    /* 参照型から基本データ型へ変換(Unboxing) */
    int unboxingObject = boxingInt;
    System.out.println(unboxingObject);
    
    /* 定数を利用する*/
    System.out.println("int型の最大値：" + Integer.MAX_VALUE);
    
    /* staticメソッドを利用する*/
    String str = "321";
    int value1 = Integer.parseInt(str); // 文字列からint型に変換
    int value2 = 300;
    System.out.println("2つの値のうち大きい方：" + Integer.max(value1, value2));
    System.out.println("2つの整数を加算：" + Integer.sum(value1, value2));
  }
}