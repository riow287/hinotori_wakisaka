public class SavingAccount {
  /**
   * ���ʗa��������\���܂��B
   * @author
   */

  /**
   *�������`
   */
  private String name;

  /**
   *�c��
   */
  private int balance;

  /**
   * �����o��
   * @param amount
   * @return ���z
   */
  int withdraw(int amount) {
    int refund; // ���o���z
    if (balance >= amount) {
      refund = amount;
      balance -= amount;
    } else {
      System.out.println("���������o�s�F�c�����s�����Ă��܂��B������\n");
      refund = 0;
    }
    return refund;
  }

  /**
   * �a������
   * @param amount
   */
  void deposit(int amount) { balance += amount; }

  /**
   * �c���Ɖ�
   */
  void checkBalance() {
    System.out.println("������ �c���Ɖ����");
    System.out.println("�������`�F" + name);
    System.out.println("�c���F" + balance + "�~");
  }

  /**
   *
   * @return name �������`
   */
  public String getName() { 
    return name; 
  }

  /**
   *
   * @param name �������`
   */
  public void setName(String name) { 
    this.name = name; 
  }

  /**
   * 
   * @return balance �c��
   */
  public int getBalance(){
    return balance;
  }

  /**
   *
   * @param balance �c��
   */
  public void setBalance(int balance) { 
    this.balance = balance;
  }
}