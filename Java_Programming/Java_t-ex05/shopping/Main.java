package shopping;

import java.util.Scanner;

/**
 * メイン
 * @author name
 */
public class Main {

  // 0: 購入モード 1: 返品モード
  private static final int PURCHASE_MODE = 0;
  private static final int RETURN_MODE = 1;

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

    Scanner sc = new Scanner(System.in);

    Customer customer = new Customer("田中", 20000000);
    customer.print();

    int mode = PURCHASE_MODE;

    System.out.println("購入したい商品を選んでください。");

    while (true) {
      if (mode == PURCHASE_MODE) {
        mode = purchaseMode(customer, shop, itemArry, sc);
      } else if (mode == RETURN_MODE) {
        mode = returnMode(customer, sc);
      }
      if (mode == -1) {
        break;
      }
    }

    System.out.println("\n========清算========");
    customer.printMyCart();
    customer.checkOut();
    customer.print();
  }

  private static int purchaseMode(Customer customer, Shop shop, Item[] itemArry,
                                  Scanner sc) {
    System.out.print(
        "商品番号（qで買物を終了/cでカートの中身を表示/rで返品）？ ");

    String inp = sc.nextLine();

    // qで買物を終了
    if (inp.equals("q")) {
      return -1;
    }

    // cでカートの中身を表示
    else if (inp.equals("c")) {
      customer.printMyCart();
    }

    // rで返品モードに切替
    else if (inp.equals("r")) {
      System.out.println("\n■□■□■現在返品モードです。■□■□■");
      customer.printMyCart();
      return RETURN_MODE;
    }

    // カート追加
    else {
      addCart(customer, shop, itemArry, inp);
    }

    return PURCHASE_MODE;
  }

  private static void addCart(Customer customer, Shop shop, Item[] itemArry,
                              String inp) {
    try {
      int itemNo = Integer.parseInt(inp);

      if (itemNo >= 0 && itemNo < itemArry.length) {
        customer.add(shop, itemNo);
      }
      // 存在しない商品番号が指定されたとき
      else {
        System.out.println(
            "指定された商品番号に該当する商品は商品リストにありません。");
      }
      // 不適切な値が入力されたとき
    } catch (NumberFormatException e) {
      System.out.println("数値または指定の文字を入力してください。");
    }
  }

  private static int returnMode(Customer customer, Scanner sc) {
    System.out.print("返品する商品番号（q で返品を終了）？ ");

    String inp = sc.nextLine();

    // qで返品モードを終了
    if (inp.equals("q")) {
      System.out.println("■□■□■返品モードを解除しました。■□■□■");
      return PURCHASE_MODE;
    } else {
      removeCart(customer, inp);
    }
    return RETURN_MODE;
  }

  private static void removeCart(Customer customer, String inp) {
    try {
      int itemNo = Integer.parseInt(inp);

      customer.remove(itemNo);
      customer.printMyCart();

      // 不適切な値が入力されたとき
    } catch (NumberFormatException e) {
      System.out.println("数値または指定の文字を入力してください。");
    }
  }
}