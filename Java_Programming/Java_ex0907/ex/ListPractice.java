package ex;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<Employee>();

    // EmployeeクラスのインスタンスをListオブジェクトに追加
    employeeList.add(new Employee("佐藤加奈子", "総務部")); // 要素を追加
    employeeList.add(new Employee("小林健司", "システム開発部"));
    employeeList.add(new Employee("鈴木直美", "経理部"));
    employeeList.add(new Employee("佐藤進", "営業部"));
    employeeList.add(new Employee("山田幸太郎", "企画部"));

    System.out.print("1つ目の要素へのアクセス→");
    employeeList.get(0).showEmployeeInfo();
    System.out.println();

    System.out.print("4つ目の要素へのアクセス→");
    employeeList.get(3).showEmployeeInfo();
    System.out.println();
    System.out.println();

    System.out.println("すべての要素へ先頭から順にアクセス");
    for (Employee employee : employeeList) {
      employee.showEmployeeInfo();
      System.out.println();
    }

    System.out.println();

    System.out.print("1つ目の要素の部署を変更する\n");
    employeeList.get(0).setSection("システム開発部");

    System.out.print("1つ目の要素へのアクセス（部署変更後）→");
    employeeList.get(0).showEmployeeInfo();
  }
}
