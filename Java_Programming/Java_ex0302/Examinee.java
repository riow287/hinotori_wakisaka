/**
 * 試験の『受験者』を表します。
 * @author name
 */

public class Examinee {
  /**
   * 受験者名
   */
  String name;

  /**
   * 筆記試験の得点
   */
  int score;

  /**
   * 実技試験の評価グレード
   */
  String grade;

  /**
   * 新しいExamineeオブジェクトを構築します。
   */
  Examinee() {}

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
}