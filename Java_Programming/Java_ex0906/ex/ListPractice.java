package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {

  /**
   * メインメソッド
   * @param args コマンドライン引数
   */
  public static void main(String[] args) {

    List<Integer> intList = new ArrayList<Integer>();
    intList.add(7);
    intList.add(2);
    intList.add(5);
    intList.add(3);
    intList.add(9);

    System.out.print("すべての要素を先頭から表示：");
    for (int obj : intList) {
      System.out.print(obj + " ");
    }
    System.out.println();

    System.out.print("すべての要素を最後尾から表示：");
    for (int i = intList.size() - 1; i >= 0; i--) {
      System.out.print(intList.get(i) + " ");
    }
    System.out.println();
  }
}
