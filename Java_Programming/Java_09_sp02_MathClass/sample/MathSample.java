package sample;

/**
 * Math�N���X���g�����T���v���ł�
 * @author emBex Education
 */
public class MathSample {

  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {

    /* �萔�𗘗p����*/
    System.out.println("�~�����F" + Math.PI);

    /* static���\�b�h�𗘗p����*/
    int value1 = 2;
    int value2 = 3;

    System.out.println("2�̒l�̂����傫�����F" + Math.max(value1, value2));
    System.out.println("2�̒l�̂������������F" + Math.min(value1, value2));
    System.out.println("2�̒l�̐ρF" + Math.multiplyExact(value1, value2));

    int randomValue = (int)(Math.random() * 10);
    System.out.println("0-9�͈̔͂̃����_���l�F" + randomValue);
  }
}