
/*
 * Java_02_sp01_Class
 * SavingAccount.java
 */
/**
 * ���ʗa������
 * @author xxx
 */

public class SavingAccount {
  /**
   * �������`
   */
  String name;

  /**
   * �c��
   */
  int balance;
  
  /**
   * �w�肳�ꂽ���z�������o��
   * �c�����s�����Ă���ꍇ�́A���o�����s�킸�A0��Ԃ��܂��B
   * @param amount  ���o��]���z
   * @return        ���o���z
   */
  int withdraw(int amount) {
    int refund;     // ���o���z
    if (balance >= amount) {
      refund = amount;
      balance -= amount;
    } else {
      System.out.println("���������o�s�F�c�����s�����Ă��܂��B������");
      refund = 0;
    }
    return refund;
  }

  /**
   * �w�肳�ꂽ���z��a������܂��B
   * @param amount �a�����z
   */
  void deposit(int amount) { 
    balance += amount; 
  }
  
  /**
   * �c���Ɖ�����܂�
   */
  void checkBalance() {
    System.out.println("������ �c���Ɖ����");
    System.out.println("�������`�F" + name);
    System.out.println("�c���F" + balance + "�~");
  }
}