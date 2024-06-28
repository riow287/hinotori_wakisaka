package sample;
/**
 * LoanableAccountのテストクラスです。
 * @author name
 */

public class LoanableAccountTest {
  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {
    // インスタンス化してインスタンス変数laに代入
    LoanableAccount la = new LoanableAccount("山田太郎", 100000, 2000);
    la.checkBalance();
    la.showOverdraftLimit();
  }
}