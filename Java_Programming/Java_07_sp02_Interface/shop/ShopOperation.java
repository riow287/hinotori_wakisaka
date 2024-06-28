package shop;

public class ShopOperation {
  /**
   * メインメソッド
   * @param args この引数は使用しない
   */
  public static void main(String[] args) {

    System.out.println("■本日の業務を開始します。");
    
    Purchase purchase = new Purchase(); // 仕入れ
    Delivery delivery = new Delivery(); // 納品
    Bill bill = new Bill();             // 請求
    Reserve reserve = new Reserve();    // 予約受付
    Receipt receipt = new Receipt();    // 代金回収
    
    System.out.println("\n■本日発生した取引のうち、顧客へ渡す帳票を印刷します。");
    FormPrint[] form = {delivery, bill, receipt};
    for (int i = 0; i < form.length; i++) {
      form[i].print();
    }
  }
}