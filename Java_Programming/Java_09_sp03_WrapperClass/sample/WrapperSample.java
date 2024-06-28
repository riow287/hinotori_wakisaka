package sample;
/**
 * ���b�p�[�N���X�̗��p���@�̃T���v���ł��B
 * @author emBex Education
 */
public class WrapperSample {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    /* ��{�f�[�^�^����Q�ƌ^�֕ϊ�*/
    Integer object = Integer.valueOf(100);
    
    /* �Q�ƌ^�����{�f�[�^�^�֕ϊ�*/
    int primitive = object.intValue();
    System.out.println(primitive);
    
    /* ��{�f�[�^�^����Q�ƌ^�֕ϊ�(Boxing) */
    Integer boxingInt = 300;
    
    /* �Q�ƌ^�����{�f�[�^�^�֕ϊ�(Unboxing) */
    int unboxingObject = boxingInt;
    System.out.println(unboxingObject);
    
    /* �萔�𗘗p����*/
    System.out.println("int�^�̍ő�l�F" + Integer.MAX_VALUE);
    
    /* static���\�b�h�𗘗p����*/
    String str = "321";
    int value1 = Integer.parseInt(str); // �����񂩂�int�^�ɕϊ�
    int value2 = 300;
    System.out.println("2�̒l�̂����傫�����F" + Integer.max(value1, value2));
    System.out.println("2�̐��������Z�F" + Integer.sum(value1, value2));
  }
}