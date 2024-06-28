package ex;

/**
 * xxxの抽象クラスです。
 * @author name
 */
public abstract class AbstractShape {

  /**
   * 高さ、半径
   */
  protected int length;

  /**
   * 図形の面積を返します。
   * @return xxx
   */
  abstract double getArea();

  /**
   * 図形の情報を表示します
   */
  abstract void print();
}