package ex;

import ex.Drawable;

/**
 * �`��̃e�X�g�N���X
 * @author name
 */
public class DrawableTest {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    Drawable rectangle = new Rectangle(3, 5);
    rectangle.draw('X');

    System.out.println();

    Drawable horizontalLine = new HorizontalLine(20);
    horizontalLine.draw('*');

  }
}
