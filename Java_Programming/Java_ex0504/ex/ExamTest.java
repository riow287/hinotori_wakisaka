package ex;

/**
 * Examinationのテストクラスです
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    Examinee examinee1 = new Examinee("畑山楓", 51, "A");

    examinee1.showInfo();
    examinee1.showJudge();

    System.out.println();

    Examinee examinee2 = new Examinee("高田昇", 99);
    examinee2.showInfo();
    examinee2.showJudge();
  }
}
