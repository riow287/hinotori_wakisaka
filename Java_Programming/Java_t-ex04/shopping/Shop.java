package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * ショップクラス
 * @author name
 */
public class Shop {

  /**
   * ショップ名
   */
  private String name;

  /**
   * 商品リスト
   */
  private List<Item> listItem = new ArrayList<Item>();

  /**
   * 指定されたショップ名と商品リストを使用して、
   * 新しいShopオブジェクトを構築する
   *
   * （指定された商品番号の商品を取得する？？？？）
   * @param name ショップ名
   * @param listItem 商品リスト
   */
  public Shop(String name) {
    this.name = name;
  }

  /**
   * 商品を商品リストに追加する
   * @param item 商品
   */
  void add(Item item) { listItem.add(item); }

  /**
   * 指定された商品番号の商品を取得する
   * @param itemNo 商品番号
   */
  Item get(int itemNo) {
    return listItem.get(itemNo);
  }

  /**
   * ショップ名と商品リストの情報を表示する
   */
  void print() {
    System.out.println(
        "======================================================");
    System.out.println("いらっしゃいませ！" + name + "へようこそ。");
    System.out.println("【取扱商品】");
    for (int i = 0; i < listItem.size(); i++) {
      System.out.print(i + " "); // インデックス番号
      listItem.get(i).print();   // 商品と価格
    }
    System.out.println(
        "======================================================");
  }
}
