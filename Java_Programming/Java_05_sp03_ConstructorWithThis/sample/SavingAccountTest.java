package sample;
public class SavingAccountTest {
  /**
   * �e�X�g
   */

  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {

    // SavingAccount�N���X���C���X�^���X��
    SavingAccount sa1 = new SavingAccount("�R�c���Y");
    sa1.checkBalance();

    // SavingAccount�N���X���C���X�^���X��
    SavingAccount sa2 = new SavingAccount("�щԎq", 10000);
    sa2.checkBalance();
  }
}
