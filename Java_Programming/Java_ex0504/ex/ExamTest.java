package ex;

/**
 * Examination�̃e�X�g�N���X�ł�
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    Examinee examinee1 = new Examinee("���R��", 51, "A");

    examinee1.showInfo();
    examinee1.showJudge();

    System.out.println();

    Examinee examinee2 = new Examinee("���c��", 99);
    examinee2.showInfo();
    examinee2.showJudge();
  }
}
