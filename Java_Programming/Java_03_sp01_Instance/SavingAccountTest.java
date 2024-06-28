public class SavingAccountTest {
  /**
   * テスト
   */

  public static void main(String[] args) {
    /**
     */
    int cash;

    // SavingAccountクラスをインスタンス化
    SavingAccount sa = new SavingAccount();

    // インスタンスのメンバへアクセス
    sa.name = "山田太郎";
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
