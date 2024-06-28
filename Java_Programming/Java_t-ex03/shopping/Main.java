package shopping;

import java.util.Scanner;

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

    Item[] itemArry = {
        new Item("フリウス", 2350000),     new Item("バリヤー", 2970000),
        new Item("ベルグランド", 3150000), new Item("フォーレディーZ", 3980000),
        new Item("ガニメデ", 2620000),
    };

    for (Item item : itemArry) {
      shop.add(item);
    }

    shop.print();

    Customer customer = new Customer("田中");
    customer.print();

    Scanner sc = new Scanner(System.in);

    System.out.println("購入したい商品を選んでください。");

    while (true) {
      System.out.print("商品番号（qで買物を終了）？ ");
      String inp = sc.nextLine();

      if (inp.equals("q")) {
        break;
      }

      try {
        int itemNo = Integer.parseInt(inp);

        if (itemNo >= 0 && itemNo < itemArry.length) {
          customer.add(shop, itemNo);
        }

        else {
          System.out.println(
              "指定された商品番号に該当する商品は商品リストにありません。");
        }

      } catch (NumberFormatException e) {
        System.out.println("数値または指定の文字を入力してください。");
      }
    }

    customer.printMyCart();
  }
}
