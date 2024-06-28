 package sample;

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
   * �R���X�g���N�^
   * @param name �������`
   * @param balance �c��
   */
  public SavingAccount(String name, int balance) {
    this.name = name;
    this.balance = balance;
  }


  
  /**
   * �����o��
   * @param amount
   * @return ���o���z
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
   * ���݂̎c����S�z�����o���܂��B
   * @return refund ���o���z
   */
  int withdraw() {
    int refund = balance;
    balance = 0;
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
  public String getName() { return name; }

  /**
   *
   * @param name �������`
   */
  public void setName(String name) { this.name = name; }

  /**
   *
   * @return balance �c��
   */
  public int getBalance() { return balance; }

  /**
   *
   * @param balance �c��
   */
  public void setBalance(int balance) { this.balance = balance; }
}
