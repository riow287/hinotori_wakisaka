/*
 * JDBC_02_DBConnection
 * sample.DBSample.java
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * �f�[�^�x�[�X�ւ̐ڑ����s���T���v���v���O�����ł��B
 * @author emBex Education
 */
public class DBSample {
	/**
	 * ���C�����\�b�h
	 * @param args ���̈����͎g�p���Ȃ��B
	 */
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sampledb";

		String user = "sofdU";
		String password = "sofdP";

		try (Connection con = DriverManager.getConnection(url, user, password)){

			System.out.println("�f�[�^�x�[�X�ɐڑ����܂����B");

		} catch (SQLException e) {
			System.out.println("�������ʁF�ُ킪�������܂����B");
			e.printStackTrace();
		}
	}
}