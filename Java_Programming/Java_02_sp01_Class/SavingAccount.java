
/*
 * Java_02_sp01_Class
 * SavingAccount.java
 */
/**
 * 普通預金口座
 * @author xxx
 */

public class SavingAccount {
  /**
   * 口座名義
   */
  String name;

  /**
   * 残高
   */
  int balance;
  
  /**
   * 指定された金額を引き出す
   * 残高が不足している場合は、引出しを行わず、0を返します。
   * @param amount  引出希望金額
   * @return        引出金額
   */
  int withdraw(int amount) {
    int refund;     // 引出金額
    if (balance >= amount) {
      refund = amount;
      balance -= amount;
    } else {
      System.out.println("※※※引出不可：残高が不足しています。※※※");
      refund = 0;
    }
    return refund;
  }

  /**
   * 指定された金額を預け入れます。
   * @param amount 預入金額
   */
  void deposit(int amount) { 
    balance += amount; 
  }
  
  /**
   * 残高照会をします
   */
  void checkBalance() {
    System.out.println("■■■ 残高照会■■■");
    System.out.println("口座名義：" + name);
    System.out.println("残高：" + balance + "円");
  }
}