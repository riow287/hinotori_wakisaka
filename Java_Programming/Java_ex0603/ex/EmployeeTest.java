package ex;

/**
 * Employee�̃e�X�g�N���X�ł��B
 * @author name
 */
public class EmployeeTest {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    Employee em = new Employee("�c����Y", "������");
    em.showEmployeeInfo();

    System.out.println();

    Manager mn = new Manager("�щԎq", "�V�X�e����", "����");
    mn.showEmployeeInfo();
  }
}
