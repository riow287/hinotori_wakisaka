package ex;
public class Examination {
  /**
   * 筆記試験の配点
   */
  static final int PERFECT_SCORE = 100;

  /**
   * 筆記試験の基準点
   */
  static final int PASSING_SCORE = 70;

  /**
   * 筆記試験の合否判定
   * @param score 点数（int型）
   * @return 合否判定結果（true:合格　）
   */
  static boolean judge(int score) {
    if (score >= PASSING_SCORE) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 実技試験の合否判定
   * @param grade 評価グレード（String型）
   * @return 合否判定結果（true:合格　）
   */
  static boolean judge(String grade) {
    if (grade.equals("A")) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 総合の合否判定
   * @param score 点数（int型）
   * @param grade 評価グレード（String型）
   * @return 合否判定結果（true:合格　）
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

/* 対応表
グレード　点数　　  結果
A       条件なし　 合格
B       60<=      合格
C       80<=      合格
*/