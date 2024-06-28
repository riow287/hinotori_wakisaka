package ex;

/**
 * 従業員を表します。
 * m_employeeのDTOです。
 * @author name
 */
public class Employee {
  /**
   * コード
   */
  private String code;
  /**
   * 氏名
   */
  private String name;
  /**
   * 年齢
   */
  private int age;
  /**
   * 部署
   */
  private String section;

  /**
   * フィールドcodeの値を返します。
   * @return コード
   */
  public String getCode() { return code; }

  /**
   * フィールドcodeの値を設定します。
   * @param code コード
   */
  public void setCode(String code) { this.code = code; }

  /**
   * フィールドnameの値を返します。
   * @return 氏名
   */
  public String getName() { return name; }

  /**
   * フィールドnameの値を設定します。
   * @param name 氏名
   */
  public void setName(String name) { this.name = name; }

  /**
   * フィールドageの値を返します。
   * @return 年齢
   */
  public int getAge() { return age; }

  /**
   * フィールドageの値を設定します。
   * @param age 年齢
   */
  public void setAge(int age) { this.age = age; }

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
}

