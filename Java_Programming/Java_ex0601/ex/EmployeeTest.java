package ex;

/**
 * Employee�̃e�X�g�N���X�ł��B
 * @author name
 */
public class EmployeeTest {
  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {
    Employee em = new Employee();
    em.setName("�c����Y");
    em.setSection("������");
    em.showEmployeeInfo();

    System.out.println();

    Manager mn = new Manager();
    mn.setName("�щԎq");
    mn.setSection("�V�X�e����");
    mn.setPost("����");
    mn.showEmployeeInfo();
    mn.showPostInfo();
  }
}
