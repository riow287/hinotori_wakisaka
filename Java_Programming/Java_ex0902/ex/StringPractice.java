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

    String[] fruits = {"orange", "banana", "lemon", "apple", "peach"};

    String str = args[0];

    boolean bFound = false;
    int index = 0;
    for (int i = 0; i < fruits.length; i++) {
      if (fruits[i].equals(str)) {
        bFound = true;
        index = i;
      }
    }
    if (bFound == true) {
      System.out.println("����������w" + str + "�x���A�z��̃C���f�b�N�X�ԍ�" +
                         index + "�Ɍ�����܂����B");
    } else {
      System.out.println("����������w" + str +
                         "�x���A�z�񒆂Ɍ�����܂���ł����B");
    }
  }
}
