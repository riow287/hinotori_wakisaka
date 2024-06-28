package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * �ڋq�N���X
 * @author name
 */
public class Customer {

  /**
   * �ڋq��
   */
  private String name;

  /**
   * �J�[�g
   */
  private Cart myCart = new Cart();

  /**
   * ������
   */
  private int money;

  /**
   * �w�肳�ꂽ�ڋq�����g�p���āA
   * �V����Customer�I�u�W�F�N�g���\�z����
   * @param name �ڋq��
   */
  public Customer(String name) { this.name = name; }

  /**
   * �w�肳�ꂽ�ڋq���Ə��������g�p���āA
   * �V����Customer�I�u�W�F�N�g���\�z����
   * @param name �ڋq��
   * @param money ������
   */
  public Customer(String name, int money) {
    this.name = name;
    this.money = money;
  }

  /**
   * �J�[�g�ɏ��i��ǉ�����
   * @param shop �V���b�v
   * @param itemNo ���i�ԍ�
   */
  public void add(Shop shop, int itemNo) {
    Item myItem = shop.get(itemNo);
    myCart.add(myItem);
  }

  /**
   * �J�[�g���̏��i�𐴎Z����
   */
  public void checkOut() {
    int totalPrice = myCart.getTotalPrice();

    if (totalPrice <= money) {
      money -= totalPrice;
      myCart.clear();
    } else {
      System.out.println("���Z�s�F���������s�����Ă��܂��B");
    }
  }

  /**
   * �J�[�g���̏���\������
   */
  public void printMyCart() { myCart.print(); }

  /**
   * �ڋq����\������
   */
  public void print() {
    System.out.println("********************************************");
    System.out.println("���̖��O�́A" + name + "�ł��B");
    System.out.println("�������́A" + money + "�~�ł��B");
    printMyCart();
    System.out.println("********************************************");
  }
}
