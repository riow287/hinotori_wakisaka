package ex;

/**
 * �����`
 * @author name
 */
public class Rectangle implements Drawable {

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
   * �`�悷��
   * @param c �`�悷�镶��
   */
  @Override
  public void draw(char c) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}