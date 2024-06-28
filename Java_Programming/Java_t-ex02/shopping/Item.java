package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品
 * @author name
 */
public class Item {

  /**
   * 商品名
   */
  private String name;

  /**
   * 価格
   */
  private int price;

  /**
   * 指定された商品名と価格を使用して、
   * 新しいItemオブジェクトを構築する
   * @param name 商品名
   * @param price 価格
   */
  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  /**
   * 価格を取得する
   */
  public int getPrice() { return price; }

  /**
   * 商品名と価格を表示する
   */
  public void print() { System.out.println(name + "：" + price + "円"); }
}
