package sample;

import java.io.IOException;

/**
 * throws�錾�̃T���v���N���X�ł��B
 * @author emBex Education
 */
public class ThrowsSample {

  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    try {
      outputCharCode();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  /**
   * �����̓��͂��󂯕t���A���̕����̕����R�[�h���o�͂��郁�\�b�h�ł��B
   * @throws IOException ���o�̓G���[�����������ꍇ�B
   */
  static void outputCharCode() throws IOException {
    System.out.print("������1�������͂��Ă��������F");
    int charCode = 0;
    charCode = System.in.read();
    System.out.println("�����R�[�h�́A" + charCode + "�ł�");
  }
}