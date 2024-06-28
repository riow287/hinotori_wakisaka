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
    Examinee examinee1 = new Examinee();
    // インスタンスのメンバへアクセス
    examinee1.name = "浜田南";
    examinee1.score = 83;
    examinee1.grade = "B";

    // インスタンス化
    Examinee examinee2 = new Examinee();
    // インスタンスのメンバへアクセス
    examinee2.name = "上田翔平";
    examinee2.score = 48;
    examinee2.grade = "A";

    examinee1.showInfo();
    System.out.println();
    examinee2.showInfo();
  }
}
