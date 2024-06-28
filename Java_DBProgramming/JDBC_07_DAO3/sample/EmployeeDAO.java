/*
 * JDBC_07_DAO3
 * sample.EmployeeDAO.java
 */
package sample;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * m_employee�e�[�u����DAO�ł��B
 * @author emBex Education
 */
public class EmployeeDAO {
  /**
   * �w�肳�ꂽ���e�̏]�ƈ�����o�^���܂��B
   * @param employee �]�ƈ��I�u�W�F�N�g
   * @return ��������
   * @throws SQLException
   */
  public int insert(Employee employee) throws SQLException {
    int count = 0; // ��������
    // �f�[�^�x�[�X�ւ̐ڑ��̎擾�APreparedStatement�̎擾
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "INSERT INTO m_employee VALUES(?, ?, ?, ?)")) {
      // DTO����̃f�[�^�̎��o��
      String code = employee.getCode();
      String name = employee.getName();
      int age = employee.getAge();
      String section = employee.getSection();
      // �v���[�X�z���_�ւ̒l�̐ݒ�
      pstmt.setString(1, code);
      pstmt.setString(2, name);
      pstmt.setInt(3, age);
      pstmt.setString(4, section);
      // SQL�X�e�[�g�����g�̎��s
      count = pstmt.executeUpdate();
    }
    return count;
  }
  /**
   * ���ׂĂ̏]�ƈ��I�u�W�F�N�g�̃��X�g��Ԃ��܂��B
   * @return �]�ƈ��I�u�W�F�N�g�̃��X�g
   * @throws SQLException
   */
  public List<Employee> selectAll() throws SQLException {
    List<Employee> employeeList = new ArrayList<Employee>();
    try (Connection con = ConnectionManager.getConnection();
         Statement stmt = con.createStatement();
         ResultSet res = stmt.executeQuery("SELECT * FROM m_employee")) {
      while (res.next()) {
        String code = res.getString("code");
        String name = res.getString("name");
        int age = res.getInt("age");
        String section = res.getString("section");
        Employee employee = new Employee();
        employee.setCode(code);
        employee.setName(name);
        employee.setAge(age);
        employee.setSection(section);
        employeeList.add(employee);
      }
    }
    return employeeList;
  }
  /**
   * �w�肳�ꂽ�R�[�h����]�ƈ��̎������������ĕԂ��܂��B
   * @param code �]�ƈ��̃R�[�h
   * @return �]�ƈ��̎���
   * @throws SQLException
   */
  public String selectName(String code) throws SQLException {
    String name = null; // ����
    // �f�[�^�x�[�X�ւ̐ڑ��̎擾�APreparedStatement�̎擾
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "SELECT name FROM m_employee WHERE code = ?")) {
      // �v���[�X�z���_�ւ̒l�̐ݒ�
      pstmt.setString(1, code);
      // SQL�X�e�[�g�����g�̎��s
      ResultSet res = pstmt.executeQuery();
      // ���ʂ̑���
      if (res.next()) {
        name = res.getString("name");
      }
    }
    return name;
  }
  /**
   * �w�肳�ꂽ�����ɑ�����]�ƈ��̎����̃��X�g��Ԃ��܂��B
   * @param section ����
   * @return �]�ƈ��̎����̃��X�g
   * @throws SQLException
   */
  public List<String> selectNameList(String section) throws SQLException {
    List<String> nameList = new ArrayList<String>(); // ����
    // �f�[�^�x�[�X�ւ̐ڑ��̎擾�APreparedStatement�̎擾
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt = con.prepareStatement(
             "SELECT name FROM m_employee WHERE section = ?")) {
      // �v���[�X�z���_�ւ̒l�̐ݒ�
      pstmt.setString(1, section);
      // SQL�X�e�[�g�����g�̎��s
      ResultSet res = pstmt.executeQuery();
      // ���ʂ̑���
      while (res.next()) {
        nameList.add(res.getString("name"));
      }
    }
    return nameList;
  }
  /**
   * �w�肳�ꂽ�R�[�h�̏]�ƈ����R�[�h���폜���܂��B
   * @param code �R�[�h
   * @return �����������R�[�h����
   * @throws SQLException
   */
  public int delete(String code)throws SQLException {
    int count = 0; // ��������
    // �f�[�^�x�[�X�ւ̐ڑ��̎擾�APreparedStatement�̎擾
    try (Connection con = ConnectionManager.getConnection();
         PreparedStatement pstmt =
             con.prepareStatement("DELETE FROM m_employee WHERE code = ?")) {
      // �v���[�X�z���_�ւ̒l�̐ݒ�
      pstmt.setString(1, code);
      // SQL�X�e�[�g�����g�̎��s
      count = pstmt.executeUpdate();
    }
    return count;
  }
}