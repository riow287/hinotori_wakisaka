package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * 拡張for文を使ったサンプルです。
 * @author emBex Education
 */
public class ForSample {
  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    /* Listオブジェクトを生成し、拡張for文で要素を表示する*/
    List<String> fruitsList = new ArrayList<String>();
    fruitsList.add("apple");
    fruitsList.add("lemon");
    fruitsList.add("peach");
    fruitsList.add("grape");
    fruitsList.add("banana");

    // （取り出した要素を代入する変数：データの集合）
    for (String str : fruitsList) {
      System.out.println(str);
    }

    /* 配列を生成し、拡張for文で要素を表示する*/
    int[] intArray = {100, 200, 300, 400, 500};

    for (int i : intArray) {
      System.out.println(i);
    }
  }
}