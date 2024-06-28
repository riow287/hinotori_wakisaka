package ex;

/**
 * 長方形
 * @author name
 */
public class Rectangle implements Drawable {

  /**
   * 高さ
   */
  private int height;

  /**
   * 幅
   */
  private int width;

  /**
   * 指定された高さと幅を使用して、
   * 新しいRectangleオブジェクトを構築します。
   * @param height 高さ
   * @param width 幅
   */
  public Rectangle(int height, int width) {
    this.height = height;
    this.width = width;
  }

  /**
   * 描画する
   * @param c 描画する文字
   */
  @Override
  public void draw(char c) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}