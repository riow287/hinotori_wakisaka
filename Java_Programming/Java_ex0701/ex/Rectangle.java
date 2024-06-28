package ex;

/**
 * �����`
 * @author name
 */
public class Rectangle extends AbstractShape {

  /**
   * ����
   */
  private int height;

  /**
   * ��
   */
  private int width;

  /**
   * �w�肳�ꂽ�����ƕ����g�p���āA
   * �V����Rectangle�I�u�W�F�N�g���\�z���܂��B
   * @param height ����
   * @param width ��
   */
  public Rectangle(int height, int width) {
    this.height = height;
    this.width = width;
  }

  /**
   * �t�B�[���hheight�̒l��Ԃ��܂��B
   * @return ����
   */
  public int getHeight() { return height; }

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
    return height * width;
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
