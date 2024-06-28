package sample;

public class LoanableAccount extends SavingAccount {

  /**
   *  借越限度額
   */
  private int overdraftLimit;

  /**
   * コンストラクタ
   * @param name 口座名義
   * @param balance 残高
   * @param overdraftLimit 借越限度額
   */
  public LoanableAccount(String name, int balance, int overdraftLimit) {
    super(name, balance);
    this.overdraftLimit = overdraftLimit;
  }

  /**
   * overdraftLimtの値を返す
   * @return overdraftLimit 借越限度額
   */
  public int getOverdraftLimit() { return overdraftLimit; }

  /**
   * overdraftLimitの値を設定
   * @param overdraftLimit 借越限度額
   */
  public void setOverdraftLimit(int overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  /**
   * 借越限度額を超えない範囲で、指定された金額を引き出します。
   * @param amount 引出金額
   * @return 引出金額
   */
  @Override
  int withdraw(int amount) {
    int refund;

    if (getBalance() + overdraftLimit > amount) {
      refund = amount;
      setBalance(getBalance() - amount);
    } else {
      // 指定引出金額が借越限度額を超えていた場合
      System.out.println(
          "※※※引出不可：引出希望金額が借越限度額を超えています※※※");
      refund = 0;
    }
    return refund;
  }

  /**
   * 現在の残高を全額引き出します。
   * 借越金額がある場合は0を返します。
   * @return 引出金額
   */
  @Override
  int withdraw() {
    int refund; // 引出金額

    if (getBalance() >= 0) {
      refund = getBalance();
    } else {
      System.out.println(
          "※※※引出不可：借越金額があるため、全額引き出し機能は利用できません※※※");
      refund = 0;
    }

    return refund;
  }

  /**
   * 引出可能残高を表示する
   */
  @Override
  void checkBalance() {
    super.checkBalance();
    System.out.println("引出可能残高：" + (getBalance() + overdraftLimit) + "円");
    showOverdraftLimit();
  }

  /**
   *  借越限度額を表示する
   */
  void showOverdraftLimit() {
    System.out.println("借越限度額：" + overdraftLimit + "円");
  }
}