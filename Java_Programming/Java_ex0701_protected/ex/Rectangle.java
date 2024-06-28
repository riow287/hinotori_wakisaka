package ex;

/**
 * �����`
 * @author name
 */
public class Rectangle extends AbstractShape {

  // /**
  //  * ����
  //  */
  // private int height;

  /**
   * ��
   */
  private int width;

  /**
   * �w�肳�ꂽ�����ƕ����g�p���āA
   * �V����Rectangle�I�u�W�F�N�g���\�z���܂��B
   * @param length ����
   * @param width ��
   */
  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  /**
   * �t�B�[���hlength�̒l��Ԃ��܂��B
   * @return ����
   */
  public int getHeight() { return length; }

  /**
   * �t�B�[���hwidth�̒l��Ԃ��܂��B
   * @return ��
   */
  public int getWidth() { return width; }

  /**
   * �}�`�̖ʐς�Ԃ��܂�
   * @return �}�`�̖ʐ�
   */
  @Override
  double getArea() { 
    return length * width;
  }

  /**
   * �}�`�̏���\�����܂�
   */
  @Override
  void print() {
    System.out.println("����" + getHeight() + "�A��" + getWidth() +
                       " �̎l�p�`�̖ʐρF" + getArea());
  }
}
