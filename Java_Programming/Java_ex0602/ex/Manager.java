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
   * �V����Manager�I�u�W�F�N�g���\�z���܂��B
   * @param name �]�ƈ��̖��O
   * @param section ����
   * @param post ��E
   */
  public Manager(String name, String section, String post) {
    super(name, section);
    this.post = post;
  }

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