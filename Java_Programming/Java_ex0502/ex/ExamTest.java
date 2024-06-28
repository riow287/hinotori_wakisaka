package ex;

/**
 * Examinationのテストクラスです
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    Examinee examinee = new Examinee("市川京子", 0, "A");

    examinee.showInfo();

    int score = examinee.getScore();    
    String grade = examinee.getGrade();

    boolean bScore = Examination.judge(score);
    if (bScore) {
      System.out.println("筆記試験：合格");
    } else {
      System.out.println("筆記試験：不合格");
    }

    boolean bGrade = Examination.judge(grade);
    if (bGrade) {
      System.out.println("実技試験：合格");
    } else {
      System.out.println("実技試験：不合格");
    }

    boolean bResult = Examination.judge(score, grade);
    if (bResult) {
      System.out.println("総合判定：合格");
    } else {
      System.out.println("総合判定：不合格");
    }
  }
}
