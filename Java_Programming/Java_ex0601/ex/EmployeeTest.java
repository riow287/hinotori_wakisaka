package ex;

/**
 * Employeeのテストクラスです。
 * @author name
 */
public class EmployeeTest {
  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {
    Employee em = new Employee();
    em.setName("田中一郎");
    em.setSection("総務部");
    em.showEmployeeInfo();

    System.out.println();

    Manager mn = new Manager();
    mn.setName("林花子");
    mn.setSection("システム部");
    mn.setPost("部長");
    mn.showEmployeeInfo();
    mn.showPostInfo();
  }
}
