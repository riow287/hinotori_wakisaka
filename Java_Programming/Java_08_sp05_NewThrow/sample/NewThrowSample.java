package sample;

/**
 * ��O�N���X��C�ӂɐ�������T���v���N���X�ł��B
 * @author emBex Education
 */
public class NewThrowSample {

  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    String result = judge(99);      // �T���v���F101
    System.out.println("����:" + result);
  }

  /**
   * �e�X�g�̓_���ɉ����������Ԃ�
   * @param score �e�X�g�̓_���i0�`100�j
   * @return ���茋��
   * @throws IllegalArgumentException ������0�`100�͈̔͊O�������ꍇ
   */
  static String judge(int score) {
    String result;
    if (0 <= score && score <= 100) {
      if (score >= 80) {
        result = "A����";
      } else if (score >= 60) {
        result = "B����";
      } else {
        result = "C����";
      }
    } else {
      String errMsg = "�s���Ȉ����F�_����0�`100�͈̔͂Ŏw�肵�Ă��������B";
      IllegalArgumentException iae = new IllegalArgumentException(errMsg);
      throw iae;
    }
    return result;
  }
}