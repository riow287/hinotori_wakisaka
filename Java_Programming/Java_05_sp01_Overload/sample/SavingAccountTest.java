package sample;
public class SavingAccountTest {
  /**
   * �e�X�g
   */

  public static void main(String[] args) {

    // SavingAccount�N���X���C���X�^���X��
    SavingAccount sa = new SavingAccount("�R�c���Y", 20000);
    sa.checkBalance();

    sa.withdraw(100);
    sa.checkBalance();
    
    sa.withdraw();  // �S�z�����o��
    sa.checkBalance();
  }
}
