package ex;
/**
 * Examination�̃e�X�g�N���X�ł�
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    boolean bPass1 = Examination.judge(70);
    boolean bPass2 = Examination.judge(69);

    if (bPass1) {
      System.out.println("�M�L�����F���i");
    } else {
      System.out.println("�M�L�����F�s���i");
    }

    if (bPass2) {
      System.out.println("�M�L�����F���i");
    } else {
      System.out.println("�M�L�����F�s���i");
    }
  }
}
