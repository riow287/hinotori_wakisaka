package ex;

/**
 * ������
 * @author name
 */
public class HorizontalLine implements Drawable {
  /**
   * ����
   */
  private int length;

  /**
   * �w�肳�ꂽ�������g�p���āA
   * �V����HorizontalLine�I�u�W�F�N�g���\�z���܂��B
   * @param lengh ����
   */
  public HorizontalLine(int length) { this.length = length; }

  /**
   * �`�悷��
   * @param c �`�悷�镶��
   */
  @Override
  public void draw(char c) {
    for (int i = 0; i < length; i++) {
      System.out.print(c);
    }
  }
}