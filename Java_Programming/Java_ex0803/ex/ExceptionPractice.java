package ex;
/**
 * ��O�����̗��K�̂��߂̃N���X�ł��B
 * @author emBex Education
 */

public class ExceptionPractice {

  /**
   * ���C�����\�b�h
   * @param args �\������z��v�f�̃C���f�b�N�X�ԍ�
   */
  public static void main(String[] args) {
    int[] intArray = {10, 25, 4, 67, 100};

    try {
      int index = Integer.parseInt(args[0]);
      System.out.println("�w�肳�ꂽ�z��̗v�f�F" + intArray[index]);

    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
      String message = e.getMessage();
      System.out.println("java.lang.NumberFormatException: " + message);

    // } catch (ArrayIndexOutOfBoundsException e) {
    //   String message = e.getMessage();
    //   System.out.println("java.lang.ArrayIndexOutOfBoundsException: " +
    //                      message);

    }
     finally {
      System.out.println("�v���O�������I�����܂�");
    }
  }
}