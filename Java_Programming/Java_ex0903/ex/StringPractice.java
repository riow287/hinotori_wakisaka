package ex;

/**
 * String�N���X���g����
 * @author name
 */
public class StringPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    String str = "Welcome to Java World!";
    String strArgs = args[0];

    int index = str.indexOf(strArgs);

    if (index != -1) {
      System.out.println("����������w" + strArgs +
                         "�x���A������̃C���f�b�N�X�ԍ�" + index +
                         "�Ɍ�����܂����B");
    } else {
      System.out.println("����������w" + strArgs +
                         "�x���A������Ɍ�����܂���ł����B");
    }
  }
}