package ex;

import java.util.Scanner;

/**
 * Scanner�N���X���g���ăL�[�{�[�h������͂��ꂽ��������R���\�[���ɏo�͂���
 * �uquit�v�����͂��ꂽ��I������
 * @author name
 */
public class ScanPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    String str = null;
    // int loop = 0;

    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        System.out.print("���������͂��Ă�������: ");
        str = sc.nextLine();

        if (str.equals("quit")) {
          System.out.println("�v���O�������I�����܂�");
          break;
        } else {
          System.out.println("���͂��ꂽ�l�́A�w" + str + "�x�ł��B");
        }
      }
    }
    
  }
}
