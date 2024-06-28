package sample;

/**
 * try-catch�\���̃T���v���N���X�ł��B
 * @author
 */
public class TryCatchSample {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    try {                               // ��O����������\�������鏈��
      int result = 1000 / 0;
      System.out.println(result);

    } catch (ArithmeticException e) {
      System.out.println("catch�u���b�N�����s���܂��B");
      String message = e.getMessage();  // ��O�L���b�`���̏���
      System.out.println(message);
    
    } finally {                         // �K�����s���鏈��
      System.out.println("finally�u���b�N�����s���܂��B");
    
    }
    System.out.println("try-catch�\���𔲂��܂����B");
  }
}