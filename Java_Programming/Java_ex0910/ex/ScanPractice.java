package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Scannerクラスを使ってキーボードから従業員の名前と部署を入力し、
 * 「q」が入力されるまで、登録作業を繰り返す
 * @author name
 */
public class ScanPractice {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    List<Employee> employeeList = new ArrayList<Employee>();

    while (true) {
      System.out.println("社員情報を登録します。（qで終了）");

      System.out.print("社員名：");
      String name = sc.nextLine();

      //  qのとき終了
      // if (name.equalsIgnoreCase("q")) {        // 
      if (name.equals("q")) {

        break;
      }

      System.out.print("部署名：");
      String section = sc.nextLine();
      System.out.println();

      Employee employee = new Employee(name, section);
      employeeList.add(employee);
    }

    System.out.println("\n登録された全従業員の情報を表示します。");
    for (Employee employee : employeeList) {
      employee.showEmployeeInfo();
    }
  }
}
