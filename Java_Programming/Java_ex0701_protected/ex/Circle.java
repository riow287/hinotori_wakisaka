package ex;

/**
 * �~
 * @author name
 */
public class Circle extends AbstractShape {

  // /**
  //  * ���a
  //  */
  // private int radius;

  /**
   * �w�肳�ꂽ�����ƕ����g�p���āA
   * �V����Circle�I�u�W�F�N�g���\�z���܂��B
   * @param length ���a
   */
  public Circle(int length) { this.length = length; }

  /**
   * �t�B�[���hlength�̒l��Ԃ��܂��B
   * @return ���a
   */
  public int getRadius() { return length; }

  /**
   * �}�`�̖ʐς�Ԃ��܂�
   * @return �}�`�̖ʐ�
   */
  @Override
  double getArea() {
    return length * length * Math.PI;
  }

  /**
   * �}�`�̏���\�����܂�
   */
  @Override
  void print() {
    System.out.println("���a" + getRadius() + " �̉~�̖ʐρF" + getArea());
  }
}