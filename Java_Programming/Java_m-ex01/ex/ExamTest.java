package ex;

/**
 * Examination�̃e�X�g�N���X�ł�
 * @author name
 */
public class ExamTest {

  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {

    Examinee[] examineeAry = new Examinee[2];
    examineeAry[0] = new Examinee("�R�c���Y", 70, "A");
    examineeAry[1] = new Examinee("�щԎq", 55, "B");

    System.out.print("1 �l�ڂ̎󌱎҂�");

    System.out.print(examineeAry[0].getName() + "����ŁA");

    System.out.println("�M�L�����̓_����" + examineeAry[0].getScore() + "�_�ł����B");

    System.out.print("2 �l�ڂ̎󌱎҂�");

    System.out.print(examineeAry[1].getName() +"����ŁA");

    System.out.println("���Z�����̕]����" + examineeAry[1].getGrade() +"����ł����B");
  }
}
