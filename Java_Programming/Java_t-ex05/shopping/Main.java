package shopping;

import java.util.Scanner;

/**
 * ���C��
 * @author name
 */
public class Main {

  // 0: �w�����[�h 1: �ԕi���[�h
  private static final int PURCHASE_MODE = 0;
  private static final int RETURN_MODE = 1;

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

    Scanner sc = new Scanner(System.in);

    Customer customer = new Customer("�c��", 20000000);
    customer.print();

    int mode = PURCHASE_MODE;

    System.out.println("�w�����������i��I��ł��������B");

    while (true) {
      if (mode == PURCHASE_MODE) {
        mode = purchaseMode(customer, shop, itemArry, sc);
      } else if (mode == RETURN_MODE) {
        mode = returnMode(customer, sc);
      }
      if (mode == -1) {
        break;
      }
    }

    System.out.println("\n========���Z========");
    customer.printMyCart();
    customer.checkOut();
    customer.print();
  }

  private static int purchaseMode(Customer customer, Shop shop, Item[] itemArry,
                                  Scanner sc) {
    System.out.print(
        "���i�ԍ��iq�Ŕ������I��/c�ŃJ�[�g�̒��g��\��/r�ŕԕi�j�H ");

    String inp = sc.nextLine();

    // q�Ŕ������I��
    if (inp.equals("q")) {
      return -1;
    }

    // c�ŃJ�[�g�̒��g��\��
    else if (inp.equals("c")) {
      customer.printMyCart();
    }

    // r�ŕԕi���[�h�ɐؑ�
    else if (inp.equals("r")) {
      System.out.println("\n�������������ݕԕi���[�h�ł��B����������");
      customer.printMyCart();
      return RETURN_MODE;
    }

    // �J�[�g�ǉ�
    else {
      addCart(customer, shop, itemArry, inp);
    }

    return PURCHASE_MODE;
  }

  private static void addCart(Customer customer, Shop shop, Item[] itemArry,
                              String inp) {
    try {
      int itemNo = Integer.parseInt(inp);

      if (itemNo >= 0 && itemNo < itemArry.length) {
        customer.add(shop, itemNo);
      }
      // ���݂��Ȃ����i�ԍ����w�肳�ꂽ�Ƃ�
      else {
        System.out.println(
            "�w�肳�ꂽ���i�ԍ��ɊY�����鏤�i�͏��i���X�g�ɂ���܂���B");
      }
      // �s�K�؂Ȓl�����͂��ꂽ�Ƃ�
    } catch (NumberFormatException e) {
      System.out.println("���l�܂��͎w��̕�������͂��Ă��������B");
    }
  }

  private static int returnMode(Customer customer, Scanner sc) {
    System.out.print("�ԕi���鏤�i�ԍ��iq �ŕԕi���I���j�H ");

    String inp = sc.nextLine();

    // q�ŕԕi���[�h���I��
    if (inp.equals("q")) {
      System.out.println("�����������ԕi���[�h���������܂����B����������");
      return PURCHASE_MODE;
    } else {
      removeCart(customer, inp);
    }
    return RETURN_MODE;
  }

  private static void removeCart(Customer customer, String inp) {
    try {
      int itemNo = Integer.parseInt(inp);

      customer.remove(itemNo);
      customer.printMyCart();

      // �s�K�؂Ȓl�����͂��ꂽ�Ƃ�
    } catch (NumberFormatException e) {
      System.out.println("���l�܂��͎w��̕�������͂��Ă��������B");
    }
  }
}