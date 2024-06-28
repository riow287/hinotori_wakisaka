package model.entity;

import java.io.Serializable;

/**
 * 
 * m_userのDTOであり、Beanオブジェクトです。
 * 
 * @author name
 */
public class UserBean implements Serializable {
	/**
	 * ユーザID
	 */
	private String id;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 氏名
	 */
	private String name;

	/**
	 * 年齢
	 */
	private int age;

	/**
	 * UserBeanを構築します。
	 */
	public UserBean() {
	}

	/**
	 * フィールドidの値を返します。
	 * 
	 * @return ユーザID
	 */
	public String getId() {
		return id;
	}

	/**
	 * フィールドidの値を設定します。
	 * 
	 * @param id ユーザID
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * フィールドpasswordの値を返します。
	 * 
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * フィールドpasswordの値を設定します。
	 * 
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * フィールドnameの値を返します。
	 * 
	 * @return 氏名
	 */
	public String getName() {
		return name;
	}

	/**
	 * フィールドnameの値を設定します。
	 * 
	 * @param name 氏名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * フィールドageの値を返します。
	 * 
	 * @return 年齢
	 */
	public int getAge() {
		return age;
	}

	/**
	 * フィールドageの値を設定します。
	 * 
	 * @param age 年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}
}