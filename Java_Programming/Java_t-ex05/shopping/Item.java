package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * ���i
 * @author name
 */
public class Item {

  /**
   * ���i��
   */
  private String name;

  /**
   * ���i
   */
  private int price;

  /**
   * �w�肳�ꂽ���i���Ɖ��i���g�p���āA
   * �V����Item�I�u�W�F�N�g���\�z����
   * @param name ���i��
   * @param price ���i
   */
  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  /**
   * ���i���擾����
   */
  public int getPrice() { return price; }

  /**
   * ���i���Ɖ��i��\������
   */
  public void print() { System.out.println(name + "�F" + price + "�~"); }
}
