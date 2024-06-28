package shopping;

/**
 * メイン
 * @author name
 */
public class Main {
  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    Shop shop = new Shop("カーショップ ジョイ");

    // Item item1 = new Item("フリウス", 2350000);
    // Item item2 = new Item("バリヤー", 2970000);
    // Item item3 = new Item("ベルグランド", 3150000);
    // Item item4 = new Item("フォーレディーZ", 3980000);
    // Item item5 = new Item("ガニメデ", 2620000);

    Item[] itemArry = {
        new Item("フリウス", 2350000),     new Item("バリヤー", 2970000),
        new Item("ベルグランド", 3150000), new Item("フォーレディーZ", 3980000),
        new Item("ガニメデ", 2620000),
    };

    for (Item item : itemArry) {
      shop.add(item);
    }

    // shop.add(item1);
    // shop.add(item2);
    // shop.add(item3);
    // shop.add(item4);
    // shop.add(item5);

    shop.print();

    Customer customer = new Customer("田中");
    customer.print();

    customer.add(shop, 0); // フリウス
    customer.add(shop, 3); // フォーレディーZ
    customer.printMyCart();
  }
}

