/*
 * JDBC_07_DAO2
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
      String code = "201063";
      System.out.println("*** �]�ƈ��̃R�[�h����]�ƈ��̎���������***");
      String name = dao.selectName(code);
      System.out.println("code���u" + code + "�v�̏]�ƈ��F" + name);
      System.out.println();
      System.out.println("*** �]�ƈ��̃R�[�h���w�肵�ă��R�[�h���폜***");
      int count = dao.delete(code);
      System.out.print("code���u" + code + "�v�̏]�ƈ����폜�F");
      System.out.println(count + "���̃��R�[�h���폜����܂����B");
      System.out.println();
      System.out.println("*** ����̕����̏]�ƈ��̎����̃��X�g���擾***");
      String section = "�c�ƕ�";
      List<String> nameList = dao.selectNameList(section);
      System.out.print(section + "�̏]�ƈ��F");
      for (String selectedName : nameList) {
        System.out.print(selectedName + " ");
      }
    } catch (SQLException e) {
      System.out.println("�������ʁF�ُ킪�������܂����B");
      e.printStackTrace();
    }
  }
}