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
      int maxAge = Integer.parseInt(args[0]);

      List<Employee> employeeList = dao.select(maxAge);
      System.out.println("***" + maxAge + "�Έȉ��̏]�ƈ�����\�� ***");

      for (Employee employee : employeeList) {
        System.out.println(employee.getCode() + " | " + employee.getName() +
                           " | " + employee.getAge() + " | " +
                           employee.getSection());
      }
    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}
