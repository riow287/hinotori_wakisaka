package ex;

/**
 * ��O�����̗��K�̂��߂̃N���X�ł��B
 * @author emBex Education
 */
public class ExceptionPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    int[] intArray = {10, 25, 4, 67, 100};
    int index = 10;

    // ��O����������\�������鏈����try�u���b�N�ň݂͂܂��B
    try {
      System.out.println("�w�肳�ꂽ�z��̗v�f�F" + intArray[index]);
    }
    // �����������O�N���X�̌^���ƕϐ������L�q���܂��B
    // ��O�L���b�`���̏������L�q���܂��B
    catch (ArrayIndexOutOfBoundsException e) {
      String message = e.getMessage();
      System.out.println("ArrayIndexOutOfBoundsException: " + message);
    }
    // ��O���������Ă����Ȃ��Ă��A�K�����s���鏈�����L�q���܂�
    finally {
      System.out.println("�v���O�������I�����܂�");
    }
  }
}