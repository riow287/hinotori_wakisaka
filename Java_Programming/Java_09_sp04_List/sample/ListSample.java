package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * List使ったサンプルです
 * @author emBex Education
 */
public class ListSample {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    /* 新しいListオブジェクトを作成*/
    List<String> fruitsList = new ArrayList<String>();

    System.out.println("リストの要素数：" + fruitsList.size());

    /* リストに要素を追加*/
    fruitsList.add("apple");
    fruitsList.add("lemon");
    fruitsList.add("peach");
    fruitsList.add("grape");

    // 
    System.out.println("リストの要素数：" + fruitsList.size());

    System.out.println("インデックス3の要素：" + fruitsList.get(3));

    /* リスト内の要素を全て表示*/
    for (int i = 0; i < fruitsList.size(); i++) {
      System.out.print(fruitsList.get(i) + " ");
    }

    System.out.println();

    /* インデックス2に要素を追加*/
    fruitsList.add(2, "banana");

    /* インデックス1の要素を削除*/
    fruitsList.remove(1);

    /* リスト内の要素を全て表示*/
    for (int i = 0; i < fruitsList.size(); i++) {
      System.out.print(fruitsList.get(i) + " ");
    }
  }
}