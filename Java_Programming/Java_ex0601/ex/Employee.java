package ex;

/**
 * 従業員の名前と部署を表示する
 * @author name
 */
public class Employee {
  /**
   * 従業員の名前
   */
  private String name;

  /**
   * 部署
   */
  private String section;

  /**
   * フィールドnameの値を返します。
   * @return 従業員の名前
   */
  public String getName() { return name; }

  /**
   * フィールドnameの値を設定します。
   * @param name 従業員の名前
   */
  public void setName(String name) { this.name = name; }

  /**
   * フィールドsectionの値を返します。
   * @return 部署
   */
  public String getSection() { return section; }

  /**
   * フィールドsectionの値を設定します。
   * @param section 部署
   */
  public void setSection(String section) { this.section = section; }

  /**
   * 従業員の名前と部署を表示する
   */
  void showEmployeeInfo() {
    System.out.println("名前：" + name);
    System.out.println("部署：" + section);
  }
}
