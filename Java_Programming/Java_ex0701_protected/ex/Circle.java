package ex;

/**
 * 円
 * @author name
 */
public class Circle extends AbstractShape {

  // /**
  //  * 半径
  //  */
  // private int radius;

  /**
   * 指定された高さと幅を使用して、
   * 新しいCircleオブジェクトを構築します。
   * @param length 半径
   */
  public Circle(int length) { this.length = length; }

  /**
   * フィールドlengthの値を返します。
   * @return 半径
   */
  public int getRadius() { return length; }

  /**
   * 図形の面積を返します
   * @return 図形の面積
   */
  @Override
  double getArea() {
    return length * length * Math.PI;
  }

  /**
   * 図形の情報を表示します
   */
  @Override
  void print() {
    System.out.println("半径" + getRadius() + " の円の面積：" + getArea());
  }
}