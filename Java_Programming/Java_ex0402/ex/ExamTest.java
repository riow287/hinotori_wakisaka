package ex;
/**
 * Examineeのテストクラスです
 * @author name
 */

public class ExamTest {

  /**
   * メインメソッド
   */
  public static void main(String[] args) {
    // インスタンス化
    Examinee examinee = new Examinee("田中一郎", 62, "B");

    examinee.showInfo();
  }
}
