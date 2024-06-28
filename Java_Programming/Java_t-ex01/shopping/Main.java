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

    // Item[] itemArry = {
    //   new Item("フリウス", 2350000),
    //   new Item("バリヤー", 2970000),
    //   new Item("ベルグランド", 3150000),
    //   new Item("フォーレディーZ", 3980000),
    //   new Item("ガニメデ", 2620000),
    // };
  
    // for (Item item : itemArry) {
    //   shop.add(item);
    // }

    shop.add(new Item("フリウス", 2350000));
    shop.add(new Item("バリヤー", 2970000));
    shop.add(new Item("ベルグランド", 3150000));
    shop.add(new Item("フォーレディーZ", 3980000));
    shop.add(new Item("ガニメデ", 2620000));

    shop.print();
  }
}
