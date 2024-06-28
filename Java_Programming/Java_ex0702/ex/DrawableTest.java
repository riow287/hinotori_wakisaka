package ex;

import ex.Drawable;

/**
 * 描画のテストクラス
 * @author name
 */
public class DrawableTest {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    Drawable rectangle = new Rectangle(3, 5);
    rectangle.draw('X');

    System.out.println();

    Drawable horizontalLine = new HorizontalLine(20);
    horizontalLine.draw('*');

  }
}
