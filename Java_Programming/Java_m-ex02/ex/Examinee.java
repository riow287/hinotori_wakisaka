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

  /**
   * �R���X�g���N�^
   * @param name �󌱎Җ�
   * @param score �M�L�����̓��_
   * @param grade ���Z�����̕]���O���[�h
   */
  Examinee(String name, int score, String grade) {
    this.name = name;
    this.score = score;
    this.grade = grade;
  }

  /**
   * �R���X�g���N�^
   * @param name �󌱎Җ�
   * @param score �M�L�����̓��_
   */
  Examinee(String name, int score) { 
    this(name, score, null); 
  }

  /**
   *
   * @return name �󌱎Җ�
   */
  public String getName() { return name; }

  /**
   *
   * @param name �󌱎Җ�
   */
  public void setName(String name) { this.name = name; }

  /**
   *
   * @return score �M�L�����̓��_
   */
  public int getScore() { return score; }

  /**
   *
   * @param score �M�L�����̓��_
   */
  public void setScore(int score) { this.score = score; }

  /**
   *
   * @return grade ���Z�����̕]���O���[�h
   */
  public String getGrade() { return grade; }

  /**
   *
   * @param grade ���Z�����̕]���O���[�h
   */
  public void setGrade(String grade) { this.grade = grade; }

  /**
   * �󌱎ҏ���\������
   *
   */
  void showInfo() {
    System.out.println("������ �󌱎ҏ�񁡁���");
    System.out.println("�󌱎Җ��F" + name);
    System.out.println("�M�L�����F" + score + "�_");
    if (grade != null) {
      System.out.println("���Z�����F" + grade);
    } else {
      System.out.println("���Z�����F�]���Ȃ�");
    }
  }

  /**
   * ���۔����\������
   *
   */
  void showJudge() {
    System.out.println("������ �@���ہ@������");
    boolean score = Examination.judge(this.score);
    if (score) {
      System.out.println("�M�L�����F���i");
    } else {
      System.out.println("�M�L�����F�s���i");
    }

    boolean grade = Examination.judge(this.grade);
    if (grade) {
      System.out.println("���Z�����F���i");
    } else {
      System.out.println("���Z�����F�s���i");
    }

    boolean result = Examination.judge(this.score, this.grade);
    if (result) {
      System.out.println("��������F���i");
    } else {
      System.out.println("��������F�s���i");
    }
  }
}
