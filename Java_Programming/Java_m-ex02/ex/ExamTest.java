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

    Examinee[] examineeAry = {
      new Examinee("�R�c���Y", 70, "A"), 
      new Examinee("�l�c��", 83, "B"),
      new Examinee("��c�ĕ�", 48, "A"), 
      new Examinee("�щԎq", 55, "A"),
      new Examinee("�c����Y", 62, "B"), 
      new Examinee("�s�싞�q", 72, "B"),
      new Examinee("���R��", 51, "A"),   
      new Examinee("���c��", 28)
    };
    
    System.out.println("������ ���v��� ������");
    System.out.println("�󌱎Ґ��F" + examineeAry.length + " ��");

    int sumScore = 0;  // �󌱎҂�score���v�l
    for (int i = 0; i < examineeAry.length; i++) {
      sumScore += examineeAry[i].getScore();
    }
    double average = (double) sumScore / examineeAry.length;  // ����

    System.out.println("�M�L�����̕��ϓ_" + average + " �_");
  }
}
