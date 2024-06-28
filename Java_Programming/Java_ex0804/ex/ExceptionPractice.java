package ex;

import java.io.IOException;

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

    try {
      outputChar();
    } catch (IOException e) {
      System.out.println("���o�̓G���[���������܂����B");
    } finally {
      System.out.println("�v���O�������I�����܂�");
    }
  }

  /**
   * �����̓��͂��󂯕t���A���̕����̕����R�[�h���o�͂��郁�\�b�h�ł��B
   * @throws IOException ���o�̓G���[�����������ꍇ�B
   */
  static void outputChar() throws IOException {
    
    // throw new IOException(); // �e�X�g�p�R�[�h
    
    System.out.print("������1 �������͂��Ă��������F");

    int charCode = 0;
    charCode = System.in.read();

    System.out.println("�����R�[�h�́A" + charCode + "�ł�");
  }
}