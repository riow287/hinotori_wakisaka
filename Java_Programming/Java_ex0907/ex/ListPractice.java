package ex;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<Employee>();

    // Employee�N���X�̃C���X�^���X��List�I�u�W�F�N�g�ɒǉ�
    employeeList.add(new Employee("�������ގq", "������")); // �v�f��ǉ�
    employeeList.add(new Employee("���ь��i", "�V�X�e���J����"));
    employeeList.add(new Employee("��ؒ���", "�o����"));
    employeeList.add(new Employee("�����i", "�c�ƕ�"));
    employeeList.add(new Employee("�R�c�K���Y", "��敔"));

    System.out.print("1�ڂ̗v�f�ւ̃A�N�Z�X��");
    employeeList.get(0).showEmployeeInfo();
    System.out.println();

    System.out.print("4�ڂ̗v�f�ւ̃A�N�Z�X��");
    employeeList.get(3).showEmployeeInfo();
    System.out.println();
    System.out.println();

    System.out.println("���ׂĂ̗v�f�֐擪���珇�ɃA�N�Z�X");
    for (Employee employee : employeeList) {
      employee.showEmployeeInfo();
      System.out.println();
    }

    System.out.println();

    System.out.print("1�ڂ̗v�f�̕�����ύX����\n");
    employeeList.get(0).setSection("�V�X�e���J����");

    System.out.print("1�ڂ̗v�f�ւ̃A�N�Z�X�i�����ύX��j��");
    employeeList.get(0).showEmployeeInfo();
  }
}
