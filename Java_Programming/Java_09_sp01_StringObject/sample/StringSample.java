package sample;

/**
 * String�N���X���g���������񑀍�̃T���v���ł�
 * @author emBex Education
 */
public class StringSample {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    String str1 = "pineapple";
    String str2 = "watermelon";
    
    System.out.println("������Ώۂ̕�����F" + str1);
    System.out.println("�������F" + str1.length());
    System.out.println("�C���f�b�N�X��3�̕����F" + str1.charAt(3));
    System.out.println("p�̍ŏ��̏o���ʒu�F" + str1.indexOf("p"));
    System.out.println("c���܂܂�邩�ǂ����F" + str1.contains("c"));
    System.out.println("p��q�ɒu���F" + str1.replace("p", "q"));
    
    System.out.println();
    
    System.out.println("������Ώۂ̕�����F" + str1 + ", " + str2);
    System.out.println("2�̒l�����������ǂ����F" + str1.equals(str2));
  }
}