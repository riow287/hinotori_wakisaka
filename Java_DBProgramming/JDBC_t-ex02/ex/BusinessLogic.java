package ex;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

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

    Scanner sc = new Scanner(System.in);

    System.out.println("***** �]�ƈ����𑀍삵�܂��B*****");
    System.out.println("s: �S�]�ƈ��̏���\�����܂��B");
    System.out.println("i: �]�ƈ�����o�^���܂��B");
    System.out.println("d: ����̏]�ƈ������폜���܂��B");
    System.out.println("q: �V�X�e�����I�����܂��B");

    while (true) {
      System.out.print(
          "\n�����I�����Ă��������B[s: ���ׂĕ\�� i: �o�^ d: �폜 q: �I��]�F");

      String inputChoice = sc.nextLine();

      // s: �S�]�ƈ��̏���\��
      if (inputChoice.equals("s")) {
        try {
          List<Employee> employeeList = dao.selectAll();

          if (employeeList.isEmpty()) {
            System.out.println("�]�ƈ�����\���ł��܂���ł����B");
          }

          else if (employeeList != null) {
            System.out.println("*** ���ׂĂ̏]�ƈ�����\�� ***");
            for (Employee employee : employeeList) {
              System.out.println(
                  employee.getCode() + " | " + employee.getName() + " | " +
                  employee.getAge() + " | " + employee.getSection());
            }
          }
        } catch (SQLException e) {
        }
      }

      // i: �]�ƈ�����o�^
      else if (inputChoice.equals("i")) {
        System.out.println("�o�^����]�ƈ������w�肵�Ă��������B");
        Employee employee = new Employee();

        System.out.print("�E�R�[�h�F");
        employee.setCode(sc.nextLine());

        System.out.print("�E�����F");
        employee.setName(sc.nextLine());

        System.out.print("�E�N��F");
        employee.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("�E�����F");
        employee.setSection(sc.nextLine());

        int insertCount = dao.insert(employee);
        if (insertCount > 0) {
          System.out.println("1���̏]�ƈ�����o�^���܂����B");
        } else {
          System.out.println("�]�ƈ�����o�^�ł��܂���ł����B");
        }
      }

      // d: ����̏]�ƈ������폜
      else if (inputChoice.equals("d")) {
        System.out.println("�폜����]�ƈ��̃R�[�h���w�肵�Ă��������B");
        System.out.print("�E�R�[�h�F");
        String inputDeleteCode = sc.nextLine();

        int deleteEmployee = dao.delete(inputDeleteCode);
        if (deleteEmployee > 0) {
          System.out.println("1���̏]�ƈ������폜���܂����B");
        } else {
          System.out.println("�]�ƈ������폜�ł��܂���ł����B");
        }
      }
      // q: �V�X�e�����I��
      else if (inputChoice.equals("q")) {
        System.out.println("�V�X�e�����I�����܂��B");
        break;
      }

      // ���͂��ꂽ�������w��̕����ȊO�������ꍇ
      else {
        System.out.println(
            "����͎��̒�����I�����Ă��������B[s: ���ׂĕ\�� i: �o�^ d: �폜 q: �I��]");
      }
    }
  }
}