package sample;

/**
 * ����������O���L���b�`����A
 * �v���O�������Ăю��s��ԂɈڍs����l�q���������T���v���v���O�����ł��B
 *
 * @author emBex Education
 */
public class ExceptionSampleZ {
  /**
   * String�^�z��𐶐����A���̗v�f���J�Ԃ��\�����܂��B
   */
  public static void methodZ() {
    String[] strAry = {"abc", "def", "ghi"};
    for (int i = 0; i <= strAry.length; i++) {
      System.out.println(strAry[i]);
    }
    System.out.println("Z���\�b�h�̏I�[�܂Ŏ��s���܂����B");
  }
}