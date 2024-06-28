package ex;

/**
 * Examinationのテストクラスです
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    boolean score = Examination.judge(70);
    if (score) {
      System.out.println("筆記試験：合格");
    } else {
      System.out.println("筆記試験：不合格");
    }

    boolean grade = Examination.judge("B");
    if (grade) {
      System.out.println("実技試験：合格");
    } else {
      System.out.println("実技試験：不合格");
    }

    boolean result = Examination.judge(60, "B");
    if (result) {
      System.out.println("総合判定：合格");
    } else {
      System.out.println("総合判定：不合格");
    }
    result = Examination.judge(59, "B");
    if (result) {
      System.out.println("総合判定：合格");
    } else {
      System.out.println("総合判定：不合格");
    }
  }
}
