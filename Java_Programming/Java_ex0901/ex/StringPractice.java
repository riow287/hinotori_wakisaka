package ex;

/**
 * String�N���X���g���ē�̕����񂪓��������ǂ����𔻒肷��
 * @author name
 */
public class StringPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C�������i2�j
   */
  public static void main(String[] args) {

    String str1 = args[0];
    String str2 = args[1];

    System.out.println("��ڂ̕�����F" + str1);
    System.out.println("��ڂ̕�����F" + str2);

    if (str1.equals(str2)) {
      System.out.println("��̕�����͓������B");
    } else {
      System.out.println("��̕�����͓������Ȃ��B");
    }
  }
}
