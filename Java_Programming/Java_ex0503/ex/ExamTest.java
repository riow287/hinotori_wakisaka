package ex;

/**
 * Examinationのテストクラスです
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    Examinee examinee = new Examinee("市川京子", 7, "B");

    examinee.showInfo();
    examinee.showJudge();
  }
}
