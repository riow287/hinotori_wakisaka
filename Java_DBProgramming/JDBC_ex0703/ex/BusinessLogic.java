package ex;

import java.sql.SQLException;

/**
 * BusinessLogic
 * @author name
 */

public class BusinessLogic {
  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    // �f�[�^�x�[�X�A�N�Z�X�I�u�W�F�N�g�̐���
    EmployeeDAO dao = new EmployeeDAO();

    // �f�[�^�x�[�X�A�N�Z�X�I�u�W�F�N�g�̗��p
    try {

      String code = args[0];
      String section = args[1];

      int count = dao.updateSection(code, section);
      
      System.out.println("*** ����̏]�ƈ��̕�����ύX���� ***");
      System.out.println(count + "���̃��R�[�h���X�V����܂����B");

    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
