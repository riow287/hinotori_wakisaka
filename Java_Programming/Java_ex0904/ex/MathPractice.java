package ex;

import java.util.Random;

/**
 * Math�N���X���g�p���A
 * 1�`100�͈̔͂̃����_���l��10�������ĕ\������
 * @author name
 */

public class MathPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    System.out.println("1�`100�͈̔͂̃����_���l��10�\�����܂��B");

    /*
     * Random�N���X��nextInt���\�b�h���g������������
     * 0����A�����Ŏw�肳�ꂽ�l�͈̗̔͂��������������
     * (0�͊܂ނ��A���̎w�肳�ꂽ�l�͊܂܂Ȃ�)
     */
    Random random = new Random();
    for (int i = 1; i <= 10; i++) {
      int randomValue = random.nextInt(100) + 1;
      System.out.println(i + "�ځF" + randomValue);
    }
  }
}