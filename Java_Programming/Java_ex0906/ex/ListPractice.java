package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    List<Integer> intList = new ArrayList<Integer>();
    intList.add(7);
    intList.add(2);
    intList.add(5);
    intList.add(3);
    intList.add(9);

    System.out.print("���ׂĂ̗v�f��擪����\���F");
    for (int obj : intList) {
      System.out.print(obj + " ");
    }
    System.out.println();

    System.out.print("���ׂĂ̗v�f���Ō������\���F");
    for (int i = intList.size() - 1; i >= 0; i--) {
      System.out.print(intList.get(i) + " ");
    }
    System.out.println();
  }
}
