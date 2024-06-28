package ex;

/**
 * 長方形
 * @author name
 */
public class Rectangle extends AbstractShape {

  // /**
  //  * 高さ
  //  */
  // private int height;

  /**
   * 幅
   */
  private int width;

  /**
   * 指定された高さと幅を使用して、
   * 新しいRectangleオブジェクトを構築します。
   * @param length 高さ
   * @param width 幅
   */
  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  /**
   * フィールドlengthの値を返します。
   * @return 高さ
   */
  public int getHeight() { return length; }

  /**
   * フィールドwidthの値を返します。
   * @return 幅
   */
  public int getWidth() { return width; }

  /**
   * 図形の面積を返します
   * @return 図形の面積
   */
  @Override
  double getArea() { 
    return length * width;
  }

  /**
   * 図形の情報を表示します
   */
  @Override
  void print() {
    System.out.println("高さ" + getHeight() + "、幅" + getWidth() +
                       " の四角形の面積：" + getArea());
  }
}
