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
    Examinee examinee = new Examinee();

    examinee.setName("林花子");
    examinee.setScore(55);
    examinee.setGrade("A");

    System.out.println("名前は" + examinee.getName() + "、");
    System.out.println("筆記は " + examinee.getScore() + " 点、");
    System.out.println("実技は " + examinee.getGrade() + " 判定でした。");
  }
}
