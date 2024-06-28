package sample;
public class SavingAccountTest {
  /**
   * テスト
   */

  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {

    // SavingAccountクラスをインスタンス化
    SavingAccount sa1 = new SavingAccount("山田太郎");
    sa1.checkBalance();

    // SavingAccountクラスをインスタンス化
    SavingAccount sa2 = new SavingAccount("林花子", 10000);
    sa2.checkBalance();
  }
}
