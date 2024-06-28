public class SavingAccountTest {
  /**
   * テスト
   */

  public static void main(String[] args) {

    // SavingAccountクラスをインスタンス化
    SavingAccount sa = new SavingAccount();

    sa.setName("山田太郎");
    sa.setBalance(10000);

    System.out.print(sa.getName());
    System.out.println(sa.getBalance());
  }
}
