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
    Examinee examinee1 = new Examinee();
    // �C���X�^���X�̃����o�փA�N�Z�X
    examinee1.name = "�l�c��";
    examinee1.score = 83;
    examinee1.grade = "B";

    // �C���X�^���X��
    Examinee examinee2 = new Examinee();
    // �C���X�^���X�̃����o�փA�N�Z�X
    examinee2.name = "��c�ĕ�";
    examinee2.score = 48;
    examinee2.grade = "A";

    examinee1.showInfo();
    System.out.println();
    examinee2.showInfo();
  }
}
