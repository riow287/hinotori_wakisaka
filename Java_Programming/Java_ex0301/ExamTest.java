/**
 * Examineeのテストクラスです
 * @author name
 */

public class ExamTest {

  /**
   * メインメソッド
   */
  public static void main(String[] args) {
    // examineevingAccountクラスをインスタンス化
    Examinee examinee = new Examinee();

    // インスタンスのメンバへアクセス
    examinee.name = "山田太郎";
    examinee.score = 70;
    examinee.grade = "A";
    examinee.showInfo();
  }
}
