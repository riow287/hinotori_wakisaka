package ex;

/**
 * Employeeのテストクラスです。
 * @author name
 */
public class EmployeeTest {
  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {
    Employee em = new Employee("田中一郎", "総務部");
    em.showEmployeeInfo();

    System.out.println();

    Manager mn = new Manager("林花子", "システム部", "部長");
    mn.showEmployeeInfo();
  }
}
