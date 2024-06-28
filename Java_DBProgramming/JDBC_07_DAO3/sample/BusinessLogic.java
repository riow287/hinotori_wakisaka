/*
 * JDBC_07_DAO3
 * sample.BusinessLogic.java
 */
package sample;
import java.sql.SQLException;
import java.util.List;
/**
 * EmployeeDAO���g�����Ɩ��������s���N���X�ł��B
 * @author emBex Education
 */
public class BusinessLogic {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ�
   */
  public static void main(String[] args) {
    // �f�[�^�x�[�X�A�N�Z�X�I�u�W�F�N�g�̐���
    EmployeeDAO dao = new EmployeeDAO();
    // �f�[�^�x�[�X�A�N�Z�X�I�u�W�F�N�g�̗��p
    try {
      // �]�ƈ����̓o�^
      Employee employee = new Employee();
      employee.setCode("201815");
      employee.setName("�n�ꌒ��");
      employee.setAge(28);
      employee.setSection("������");
      int count = dao.insert(employee);
      System.out.println(count + "���̃f�[�^��o�^���܂����B");
      // ���ׂĂ̏]�ƈ��̏���\��
      System.out.println("*** ���ׂĂ̏]�ƈ�����\��***");
      List<Employee> employeeList = dao.selectAll();
      for (Employee tempEmp : employeeList) {
        String code = tempEmp.getCode();
        String name = tempEmp.getName();
        int age = tempEmp.getAge();
        String section = tempEmp.getSection();
        System.out.print(code + "\t| ");
        System.out.print(name + "\t| ");
        System.out.print(age + "\t| ");
        System.out.print(section + "\n");
      }
    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}