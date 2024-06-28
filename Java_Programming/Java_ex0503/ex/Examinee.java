package ex;
/**
 * 試験の『受験者』を表します。
 * @author name
 */

public class Examinee {
  /**
   * 受験者名
   */
  private String name;

  /**
   * 筆記試験の得点
   */
  private int score;

  /**
   * 実技試験の評価グレード
   */
  private String grade;

  /**
   * コンストラクタ
   * @param name 受験者名
   * @param score 筆記試験の得点
   * @param grade 実技試験の評価グレード
   */
  Examinee(String name, int score, String grade) {
    this.name = name;
    this.score = score;
    this.grade = grade;
  }

  /**
   *
   * @return name 受験者名
   */
  public String getName() { return name; }

  /**
   *
   * @param name 受験者名
   */
  public void setName(String name) { this.name = name; }

  /**
   *
   * @return score 筆記試験の得点
   */
  public int getScore() { return score; }

  /**
   *
   * @param score 筆記試験の得点
   */
  public void setScore(int score) { this.score = score; }

  /**
   *
   * @return grade 実技試験の評価グレード
   */
  public String getGrade() { return grade; }

  /**
   *
   * @param grade 実技試験の評価グレード
   */
  public void setGrade(String grade) { this.grade = grade; }

  /**
   * 受験者情報を表示する
   *
   */
  void showInfo() {
    System.out.println("■■■ 受験者情報■■■");
    System.out.println("受験者名：" + name);
    System.out.println("筆記試験：" + score + "点");
    System.out.println("実技試験：" + grade);
  }

  /**委譲
   * 合否判定を表示する
   *
   */
  void showJudge() {
    System.out.println("■■■ 　合否　■■■");
    boolean score = Examination.judge(this.score);
    if (score) {
      System.out.println("筆記試験：合格");
    } else {
      System.out.println("筆記試験：不合格");
    }

    boolean grade = Examination.judge(this.grade);
    if (grade) {
      System.out.println("実技試験：合格");
    } else {
      System.out.println("実技試験：不合格");
    }

    boolean result = Examination.judge(this.score,this.grade);
    if (result) {
      System.out.println("総合判定：合格");
    } else {
      System.out.println("総合判定：不合格");
    }
  }
}