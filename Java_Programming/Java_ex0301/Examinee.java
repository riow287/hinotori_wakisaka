/**
 * �����́w�󌱎ҁx��\���܂��B
 * @author name
 */

public class Examinee {
  /**
   * �󌱎Җ�
   */
  String name;

  /**
   * �M�L�����̓��_
   */
  int score;

  /**
   * ���Z�����̕]���O���[�h
   */
  String grade;

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
}