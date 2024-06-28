package ex;

/**
 * クラスのテストクラスです。
 * @author name
 */
public class ShapeTest {
  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(3, 5);
    rectangle.print();
    
    Circle circle = new Circle(3);
    circle.print();
    
  }
}
