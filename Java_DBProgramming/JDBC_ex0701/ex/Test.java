package ex;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * �f�[�^�x�[�X�ւ̐ڑ����s��
 * @author name
 */
public class Test {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    try {
      Connection con = ConnectionManager.getConnection();
      System.out.println("sampledb�ւ̐ڑ��ɐ������܂����B");

    } catch (SQLException e) {
      System.out.println("��������: �ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
