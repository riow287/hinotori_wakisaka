package ex;

/**
 * Examination�̃e�X�g�N���X�ł�
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    Examinee examinee = new Examinee("�s�싞�q", 0, "A");

    examinee.showInfo();

    int score = examinee.getScore();    
    String grade = examinee.getGrade();

    boolean bScore = Examination.judge(score);
    if (bScore) {
      System.out.println("�M�L�����F���i");
    } else {
      System.out.println("�M�L�����F�s���i");
    }

    boolean bGrade = Examination.judge(grade);
    if (bGrade) {
      System.out.println("���Z�����F���i");
    } else {
      System.out.println("���Z�����F�s���i");
    }

    boolean bResult = Examination.judge(score, grade);
    if (bResult) {
      System.out.println("��������F���i");
    } else {
      System.out.println("��������F�s���i");
    }
  }
}
