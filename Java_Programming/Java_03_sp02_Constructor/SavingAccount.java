public class SavingAccount {
  /**
   * ���ʗa��������\���܂��B
   * @author
   */

  /**
   *�������`
   */
  String name;

  /**
   *�c��
   */
  int balance;

  /**
   * �R���X�g���N�^
   */ 
  SavingAccount() {
    System.out.println("SavingAccount�N���X���C���X�^���X�����܂��B");
  }

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
}
