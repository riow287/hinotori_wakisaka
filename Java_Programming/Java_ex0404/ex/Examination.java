package ex;
public class Examination {
  /**
   * •M‹LŽŽŒ±‚Ì”z“_
   */
  static final int PERFECT_SCORE = 100;

  /**
   * •M‹LŽŽŒ±‚ÌŠî€“_
   */
  static final int PASSING_SCORE = 70;

  /**
   * •M‹LŽŽŒ±‚Ì‡”Û”»’è
   */
  static boolean judge(int score) {
    if (score >= PASSING_SCORE) {
      return true;
    } else {
      return false;
    }
  }
}
