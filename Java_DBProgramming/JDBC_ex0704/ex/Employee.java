package ex;

/**
 * �]�ƈ���\���܂��B
 * m_employee��DTO�ł��B
 * @author name
 */
public class Employee {
  /**
   * �R�[�h
   */
  private String code;
  /**
   * ����
   */
  private String name;
  /**
   * �N��
   */
  private int age;
  /**
   * ����
   */
  private String section;

  /**
   * �t�B�[���hcode�̒l��Ԃ��܂��B
   * @return �R�[�h
   */
  public String getCode() { return code; }

  /**
   * �t�B�[���hcode�̒l��ݒ肵�܂��B
   * @param code �R�[�h
   */
  public void setCode(String code) { this.code = code; }

  /**
   * �t�B�[���hname�̒l��Ԃ��܂��B
   * @return ����
   */
  public String getName() { return name; }

  /**
   * �t�B�[���hname�̒l��ݒ肵�܂��B
   * @param name ����
   */
  public void setName(String name) { this.name = name; }

  /**
   * �t�B�[���hage�̒l��Ԃ��܂��B
   * @return �N��
   */
  public int getAge() { return age; }

  /**
   * �t�B�[���hage�̒l��ݒ肵�܂��B
   * @param age �N��
   */
  public void setAge(int age) { this.age = age; }

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
}

