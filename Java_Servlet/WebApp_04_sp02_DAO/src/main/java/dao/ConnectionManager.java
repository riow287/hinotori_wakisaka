/*
* WebApp_04_sp02_DAO
* dao.ConnectionManager.java
*/
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* コネクションマネージャ
* @author emBex Education
*/
public class ConnectionManager {
	/**
	* データベースURL
	*/
	private final static String URL = "jdbc:mysql://localhost:3306/sampledb";
	/**
	* ユーザ
	*/
	private final static String USER = "embexU";
	/**
	* パスワード
	*/
	private final static String PASSWORD = "embexP";
	
	/**
	* データベースへの接続を取得して返します。
	*
	* @return コネクション
	* @throws SQLException
	* @throws ClassNotFoundException
	*/
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		// JDBCドライバの読み込み
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}