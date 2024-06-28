package ex;
public class Examination {
  /**
   * �M�L�����̔z�_
   */
  static final int PERFECT_SCORE = 100;

  /**
   * �M�L�����̊�_
   */
  static final int PASSING_SCORE = 70;

  /**
   * �M�L�����̍��۔���
   * @param score �_���iint�^�j
   * @return ���۔��茋�ʁitrue:���i�@�j
   */
  static boolean judge(int score) {
    if (score >= PASSING_SCORE) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * ���Z�����̍��۔���
   * @param grade �]���O���[�h�iString�^�j
   * @return ���۔��茋�ʁitrue:���i�@�j
   */
  static boolean judge(String grade) {
    if (grade.equals("A")) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * �����̍��۔���
   * @param score �_���iint�^�j
   * @param grade �]���O���[�h�iString�^�j
   * @return ���۔��茋�ʁitrue:���i�@�j
   */
  static boolean judge(int score, String grade) {
    boolean bResult = true;

    if (grade.equals("A")) {
      bResult = true;
    } else if (grade.equals("B")) {
      bResult = score >= 60 ? true : false;
    } else {
      bResult = score >= 80 ? true : false;
    }
    return bResult;
  }
}

/* �Ή��\
�O���[�h�@�_���@�@  ����
A       �����Ȃ��@ ���i
B       60<=      ���i
C       80<=      ���i
*/