package sample;

/**
 * ��O�����ɂ��v���O�����������I������l�q���������T���v���v���O�����ł��B
 * @author emBex Education
 */
public class ExceptionSampleX {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    try {
      // ExceptionSampleY�N���X��methodY���\�b�h���Ăяo���܂��B
      ExceptionSampleY.methodY();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("��O���L���b�`���܂����B");
    }
    System.out.println("���C�����\�b�h�̏I�[�܂Ŏ��s���܂����B");
  }
}