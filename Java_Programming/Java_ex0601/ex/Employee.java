package ex;

/**
 * �]�ƈ��̖��O�ƕ�����\������
 * @author name
 */
public class Employee {
  /**
   * �]�ƈ��̖��O
   */
  private String name;

  /**
   * ����
   */
  private String section;

  /**
   * �t�B�[���hname�̒l��Ԃ��܂��B
   * @return �]�ƈ��̖��O
   */
  public String getName() { return name; }

  /**
   * �t�B�[���hname�̒l��ݒ肵�܂��B
   * @param name �]�ƈ��̖��O
   */
  public void setName(String name) { this.name = name; }

  /**
   * �t�B�[���hsection�̒l��Ԃ��܂��B
   * @return ����
   */
  public String getSection() { return section; }

  /**
   * �t�B�[���hsection�̒l��ݒ肵�܂��B
   * @param section ����
   */
  public void setSection(String section) { this.section = section; }

  /**
   * �]�ƈ��̖��O�ƕ�����\������
   */
  void showEmployeeInfo() {
    System.out.println("���O�F" + name);
    System.out.println("�����F" + section);
  }
}
