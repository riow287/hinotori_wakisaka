package ex;

import java.util.Scanner;

/**
 * Scanner�N���X���g���ăL�[�{�[�h���͂��ꂽ�l���o�͂���
 * @author name
 */
public class ScanPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    String str = null;

    // Scanner�N���X�̃I�u�W�F�N�g�𐶐�
    Scanner sc = new Scanner(System.in);

    System.out.print("���O����͂��Ă��������F");

    // �L�[�{�[�h������͂����l��String�^�ϐ�str�ɑ��
    str = sc.next();

    System.out.println(str + "����A����ɂ��́B");
  }
}
