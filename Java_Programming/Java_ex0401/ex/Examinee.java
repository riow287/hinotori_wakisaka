package ex;
/**
 * �����́w�󌱎ҁx��\���܂��B
 * @author name
 */

public class Examinee {
  /**
   * �󌱎Җ�
   */
  private String name;

  /**
   * �M�L�����̓��_
   */
  private int score;

  /**
   * ���Z�����̕]���O���[�h
   */
  private String grade;

  // /**
  //  * �V����Examinee�I�u�W�F�N�g���\�z���܂��B
  //  */
  // Examinee() {}

  /**
   * �󌱎ҏ���\������
   *
   */
  void showInfo() {
    System.out.println("������ �󌱎ҏ�񁡁���");
    System.out.println("�󌱎Җ��F" + name);
    System.out.println("�M�L�����F" + score + "�_");
    System.out.println("���Z�����F" + grade);
  }

  /**
   * name�̃Q�b�^�[
   * @return name �󌱎Җ�
   */
  public String getName() { 
    return name; 
  }

  /**
   * name�̃Z�b�^�[
   * @param name �󌱎Җ�
   */
  public void setName(String name) { 
    this.name = name; 
  }

  /**
   * score�̃Q�b�^�[
   * @return score �M�L�����̓��_
   */
  public int getScore(){
    return score;
  }

  /**
   * score�̃Z�b�^�[
   * @param score �M�L�����̓��_
   */
  public void setScore(int score) { 
    this.score = score;
  }

  /**
   * grade�̃Q�b�^�[
   * @return grade ���Z�����̕]���O���[�h
   */
  public String getGrade(){
    return grade;
  }

  /**
   * grade�̃Z�b�^�[
   * @param grade ���Z�����̕]���O���[�h
   */
  public void setGrade(String grade) { 
    this.grade = grade;
  }
}