package ex;

/**
 * �~
 * @author name
 */
public class Circle extends AbstractShape {

  /**
   * ���a
   */
  private int radius;

  /**
   * �w�肳�ꂽ�����ƕ����g�p���āA
   * �V����Circle�I�u�W�F�N�g���\�z���܂��B
   * @param radius ���a
   */
  public Circle(int radius) { this.radius = radius; }

  /**
   * �t�B�[���hradius�̒l��Ԃ��܂��B
   * @return ���a
   */
  public int getRadius() { return radius; }

  /**
   * �}�`�̖ʐς�Ԃ��܂�
   * @return �}�`�̖ʐ�
   */
  @Override
  double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * �}�`�̏���\�����܂�
   */
  @Override
  void print() {
    System.out.println("���a" + getRadius() + " �̉~�̖ʐρF" + getArea());
  }
}