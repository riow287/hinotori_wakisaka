package sample;

public class LoanableAccount extends SavingAccount {

  /**
   *  Ø‰zŒÀ“xŠz
   */
  private int overdraftLimit;

  /**
   * ƒRƒ“ƒXƒgƒ‰ƒNƒ^
   * @param name ŒûÀ–¼‹`
   * @param balance c‚
   * @param overdraftLimit Ø‰zŒÀ“xŠz
   */
  public LoanableAccount(String name, int balance, int overdraftLimit) {
    super(name, balance);
    this.overdraftLimit = overdraftLimit;
  }

  /**
   * overdraftLimt‚Ì’l‚ğ•Ô‚·
   * @return overdraftLimit Ø‰zŒÀ“xŠz
   */
  public int getOverdraftLimit() { return overdraftLimit; }

  /**
   * overdraftLimit‚Ì’l‚ğİ’è
   * @param overdraftLimit Ø‰zŒÀ“xŠz
   */
  public void setOverdraftLimit(int overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  /**
   *  Ø‰zŒÀ“xŠz‚ğ•\¦‚·‚é
   */
  void showOverdraftLimit() {
    System.out.println("Ø‰zŒÀ“xŠzF" + overdraftLimit + "‰~");
  }
}