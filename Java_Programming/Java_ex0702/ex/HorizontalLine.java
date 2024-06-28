package ex;

/**
 * 水平線
 * @author name
 */
public class HorizontalLine implements Drawable {
  /**
   * 長さ
   */
  private int length;

  /**
   * 指定された高さを使用して、
   * 新しいHorizontalLineオブジェクトを構築します。
   * @param lengh 高さ
   */
  public HorizontalLine(int length) { this.length = length; }

  /**
   * 描画する
   * @param c 描画する文字
   */
  @Override
  public void draw(char c) {
    for (int i = 0; i < length; i++) {
      System.out.print(c);
    }
  }
}