package ex;
public class Examination {
  /**
   * ML±Μz_
   */
  static final int PERFECT_SCORE = 100;

  /**
   * ML±Μξ_
   */
  static final int PASSING_SCORE = 70;

  /**
   * ML±ΜΫ»θ
   * @param score _iint^j
   * @return Ϋ»θΚitrue:i@j
   */
  static boolean judge(int score) {
    if (score >= PASSING_SCORE) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * ΐZ±ΜΫ»θ
   * @param grade ]ΏO[hiString^j
   * @return Ϋ»θΚitrue:i@j
   */
  static boolean judge(String grade) {
    if ("A".equals(grade)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * ΜΫ»θ
   * @param score _iint^j
   * @param grade ]ΏO[hiString^j
   * @return Ϋ»θΚitrue:i@j
   */
  static boolean judge(int score, String grade) {
    boolean bResult = true;

    if ("A".equals(grade)) {
      bResult = true;
    } else if ("B".equals(grade)) {
      bResult = score >= 60 ? true : false;
    } else {
      bResult = score >= 80 ? true : false;
    }
    return bResult;
  }
}

/* Ξ\
O[h@_@@  Κ
A       πΘ΅@ i
B       60<=      i
C       80<=      i
*/