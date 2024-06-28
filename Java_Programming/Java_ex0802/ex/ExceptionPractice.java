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
    
    String str = "ABC";

    // �����ɁA�ϐ�str �̒l�� �u3�v �������ꍇ
    // String str = "3";

    try {
      int value = Integer.parseInt(str);
      System.out.println("value �̓��:" + (value * value));

    } catch (NumberFormatException e) {
      String message = e.getMessage();
      System.out.println("java.lang.NumberFormatException: " + message);

    } finally {
      System.out.println("�v���O�������I�����܂�");
    }
  }
}