package ex;
/**
 * Examinee�̃e�X�g�N���X�ł�
 * @author name
 */

public class ExamTest {

  /**
   * ���C�����\�b�h
   */
  public static void main(String[] args) {
    // �C���X�^���X��
    Examinee examinee = new Examinee();

    examinee.setName("�щԎq");
    examinee.setScore(55);
    examinee.setGrade("A");

    System.out.println("���O��" + examinee.getName() + "�A");
    System.out.println("�M�L�� " + examinee.getScore() + " �_�A");
    System.out.println("���Z�� " + examinee.getGrade() + " ����ł����B");
  }
}
