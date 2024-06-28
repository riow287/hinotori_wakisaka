package shopping;

import java.util.Scanner;

/**
 * ���C��
 * @author name
 */
public class Main {
  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    Shop shop = new Shop("�J�[�V���b�v �W���C");

    Item[] itemArry = {
        new Item("�t���E�X", 2350000),     new Item("�o�����[", 2970000),
        new Item("�x���O�����h", 3150000), new Item("�t�H�[���f�B�[Z", 3980000),
        new Item("�K�j���f", 2620000),
    };

    for (Item item : itemArry) {
      shop.add(item);
    }

    shop.print();

    Customer customer = new Customer("�c��");
    customer.print();

    Scanner sc = new Scanner(System.in);

    System.out.println("�w�����������i��I��ł��������B");

    while (true) {
      System.out.print("���i�ԍ��iq�Ŕ������I���j�H ");
      String inp = sc.nextLine();

      if (inp.equals("q")) {
        break;
      }

      try {
        int itemNo = Integer.parseInt(inp);

        if (itemNo >= 0 && itemNo < itemArry.length) {
          customer.add(shop, itemNo);
        }

        else {
          System.out.println(
              "�w�肳�ꂽ���i�ԍ��ɊY�����鏤�i�͏��i���X�g�ɂ���܂���B");
        }

      } catch (NumberFormatException e) {
        System.out.println("���l�܂��͎w��̕�������͂��Ă��������B");
      }
    }

    customer.printMyCart();
  }
}
