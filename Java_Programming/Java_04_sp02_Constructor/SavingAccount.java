public class SavingAccount {
  /**
   * 普通預金口座を表します。
   * @author
   */

  /**
   *口座名義
   */
  private String name;

  /**
   *残高
   */
  private int balance;

  /**
   *
   * @param name 口座名義
   * @param balance 残高
   */
  SavingAccount(String name, int balance) {
    this.name = name;
    this.balance = balance;
  }

  /**
   * 引き出し
   * @param amount
   * @return 金額
   */
  int withdraw(int amount) {
    int refund; // 引出金額
    if (balance >= amount) {
      refund = amount;
      balance -= amount;
    } else {
      System.out.println("※※※引出不可：残高が不足しています。※※※\n");
      refund = 0;
    }
    return refund;
  }

  /**
   * 預け入れ
   * @param amount
   */
  void deposit(int amount) { balance += amount; }

  /**
   * 残高照会
   */
  void checkBalance() {
    System.out.println("■■■ 残高照会■■■");
    System.out.println("口座名義：" + name);
    System.out.println("残高：" + balance + "円");
  }

  /**
   *
   * @return name 口座名義
   */
  public String getName() { return name; }

  /**
   *
   * @param name 口座名義
   */
  public void setName(String name) { this.name = name; }

  /**
   *
   * @return balance 残高
   */
  public int getBalance() { return balance; }

  /**
   *
   * @param balance 残高
   */
  public void setBalance(int balance) { this.balance = balance; }
}
