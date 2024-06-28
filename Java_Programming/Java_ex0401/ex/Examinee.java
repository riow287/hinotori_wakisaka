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

  // /**
  //  * 新しいExamineeオブジェクトを構築します。
  //  */
  // Examinee() {}

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

  /**
   * nameのゲッター
   * @return name 受験者名
   */
  public String getName() { 
    return name; 
  }

  /**
   * nameのセッター
   * @param name 受験者名
   */
  public void setName(String name) { 
    this.name = name; 
  }

  /**
   * scoreのゲッター
   * @return score 筆記試験の得点
   */
  public int getScore(){
    return score;
  }

  /**
   * scoreのセッター
   * @param score 筆記試験の得点
   */
  public void setScore(int score) { 
    this.score = score;
  }

  /**
   * gradeのゲッター
   * @return grade 実技試験の評価グレード
   */
  public String getGrade(){
    return grade;
  }

  /**
   * gradeのセッター
   * @param grade 実技試験の評価グレード
   */
  public void setGrade(String grade) { 
    this.grade = grade;
  }
}