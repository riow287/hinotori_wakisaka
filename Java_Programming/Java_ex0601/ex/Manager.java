package ex;

/**
 * ��E��\������
 * @author name
 */
public class Manager extends Employee {

  /**
   * ��E
   */
  private String post;

  /**
   * �t�B�[���hpost�̒l��Ԃ��܂��B
   * @return ��E
   */
  public String getPost() { return post; }

  /**
   * �t�B�[���hpost�̒l��ݒ肵�܂��B
   * @param post ��E
   */
  public void setPost(String post) {
    this.post = post;
  }
  
  /**
   * ��E�݂̂�\������
   */
  void showPostInfo() {
    System.out.println("��E�F" + post);
  }
}