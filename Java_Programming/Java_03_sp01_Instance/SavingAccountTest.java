public class SavingAccountTest {
  /**
   * �e�X�g
   */

  public static void main(String[] args) {
    /**
     */
    int cash;

    // SavingAccount�N���X���C���X�^���X��
    SavingAccount sa = new SavingAccount();

    // �C���X�^���X�̃����o�փA�N�Z�X
    sa.name = "�R�c���Y";
    sa.balance = 10000;
    sa.checkBalance();
    sa.deposit(1);
    sa.checkBalance();
    sa.withdraw(2);
    sa.checkBalance();
    cash = sa.withdraw(3);
    sa.checkBalance();
    sa.withdraw(4);
    sa.checkBalance();
  }
}
