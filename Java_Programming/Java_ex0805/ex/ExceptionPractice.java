package ex;
/**
 * ��O�����̗��K�̂��߂̃N���X�ł��B
 * @author emBex Education
 */
public class ExceptionPractice {

  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    byte num1 = 8;
    byte num2 = 5;

    try {
      byte result = add(num1, num2);
      System.out.println("�v�Z���ʁF" + result);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("�v���O�������I�����܂�");
    }
  }

  /**
   * ���byte �^�����̍��v��Ԃ��܂��B
   * ���ʂ�byte �͈̔͂𒴂���ꍇ�A��O���X���[���܂��B
   * @param num1 ��ڂ̒l
   * @param num2 ��ڂ̒l
   * @return ���byte �^�����̍��v�l
   * @throws ArithmeticException ���ʂ�byte �͈̔͂𒴂���ꍇ�B
   * �i�ڍ׃��b�Z�[�W�́u�v�Z���ʂ�byte �͈̔͂𒴂��Ă��܂��v�j
   */
  static byte add(byte num1, byte num2) {
    int result = num1 + num2;
    if (result < -128 || 127 < result) {
      String errMsg = "�v�Z���ʂ�byte�͈̔͂𒴂��Ă��܂�";
      ArithmeticException iae = new ArithmeticException(errMsg);
      throw iae;
    }
    return (byte)result;
  }
}