package ex;

/**
 * Examinationのテストクラスです
 * @author name
 */
public class ExamTest {

  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {

    Examinee[] examineeAry = new Examinee[2];
    examineeAry[0] = new Examinee("山田太郎", 70, "A");
    examineeAry[1] = new Examinee("林花子", 55, "B");

    System.out.print("1 人目の受験者は");

    System.out.print(examineeAry[0].getName() + "さんで、");

    System.out.println("筆記試験の点数は" + examineeAry[0].getScore() + "点でした。");

    System.out.print("2 人目の受験者は");

    System.out.print(examineeAry[1].getName() +"さんで、");

    System.out.println("実技試験の評価は" + examineeAry[1].getGrade() +"判定でした。");
  }
}
