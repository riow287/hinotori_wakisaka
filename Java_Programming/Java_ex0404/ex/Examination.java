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
   */
  static boolean judge(int score) {
    if (score >= PASSING_SCORE) {
      return true;
    } else {
      return false;
    }
  }
}
