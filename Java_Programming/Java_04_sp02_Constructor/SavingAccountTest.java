public class SavingAccountTest {
  /**
   * テスト
   */

  public static void main(String[] args) {

    // SavingAccountクラスをインスタンス化
    SavingAccount sa = new SavingAccount("山田太郎", 20000);

    sa.checkBalance();
  }
}
