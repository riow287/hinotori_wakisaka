package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Scanner�N���X���g���ăL�[�{�[�h����]�ƈ��̖��O�ƕ�������͂��A
 * �uq�v�����͂����܂ŁA�o�^��Ƃ��J��Ԃ�
 * @author name
 */
public class ScanPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    List<Employee> employeeList = new ArrayList<Employee>();

    while (true) {
      System.out.println("�Ј�����o�^���܂��B�iq�ŏI���j");

      System.out.print("�Ј����F");
      String name = sc.nextLine();

      //  q�̂Ƃ��I��
      // if (name.equalsIgnoreCase("q")) {        // 
      if (name.equals("q")) {

        break;
      }

      System.out.print("�������F");
      String section = sc.nextLine();
      System.out.println();

      Employee employee = new Employee(name, section);
      employeeList.add(employee);
    }

    System.out.println("\n�o�^���ꂽ�S�]�ƈ��̏���\�����܂��B");
    for (Employee employee : employeeList) {
      employee.showEmployeeInfo();
    }
  }
}
