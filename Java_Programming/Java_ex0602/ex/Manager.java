package ex;

/**
 * 役職を表示する
 * @author name
 */
public class Manager extends Employee {

  /**
   * 役職
   */
  private String post;

  /**
   * 新しいManagerオブジェクトを構築します。
   * @param name 従業員の名前
   * @param section 部署
   * @param post 役職
   */
  public Manager(String name, String section, String post) {
    super(name, section);
    this.post = post;
  }

  /**
   * フィールドpostの値を返します。
   * @return 役職
   */
  public String getPost() { return post; }

  /**
   * フィールドpostの値を設定します。
   * @param post 役職
   */
  public void setPost(String post) {
    this.post = post;
  }
  
  /**
   * 役職のみを表示する
   */
  void showPostInfo() {
    System.out.println("役職：" + post);
  }
}