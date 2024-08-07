package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * カートクラス
 * @author name
 */
public class Cart {

  /**
   * 商品リスト
   */
  private List<Item> listItem = new ArrayList<>();

  /**
   * 商品を追加する
   * @param item 商品
   */
  public void add(Item item) { listItem.add(item); }

  /**
   * すべての商品の合計価格を取得する
   */
  public int getTotalPrice() {
    int totalPrice = 0;
    for (Item item : listItem) {
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }

  /**
   * カート内の情報を表示する
   */
  public void print() {
    System.out.println("【カート内の商品】");

    if (listItem.size() == 0) {
      System.out.println("カートに商品が入っていません。");
    }

    else {
      for (int i = 0; i < listItem.size(); i++) {
        System.out.print(i + " "); // インデックス番号
        listItem.get(i).print();   // 商品と価格
      }
      System.out.println("カート内の商品の合計価格：" + getTotalPrice() + "円");
    }
  }
}
