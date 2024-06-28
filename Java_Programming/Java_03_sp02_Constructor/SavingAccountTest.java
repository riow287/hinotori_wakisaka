public class SavingAccountTest {
  /**
   * テスト
   */

  public static void main(String[] args) {
    // SavingAccountクラスをインスタンス化
    SavingAccount sa1 = new SavingAccount();
    sa1.name = "山田太郎";
    sa1.balance = 197500;
    sa1.checkBalance();

    SavingAccount sa2 = new SavingAccount();
    sa2.name = "中村香";
    sa2.balance = 89300;
    sa2.checkBalance();
  }
}
