package ex;

import java.sql.SQLException;
import java.util.List;

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

      int minAge = 20;
      int maxAge = 29;

      List<String> nameList = dao.selectName(minAge, maxAge);

      System.out.println("*** ����̔N��w�̏]�ƈ��̎����̃��X�g���擾 ***");

      System.out.println(minAge + "�΂���" + maxAge + "�΂̏]�ƈ��F");
      for (String selectedName : nameList) {
        System.out.print(selectedName + " ");
      }
    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
