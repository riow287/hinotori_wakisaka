package shopping;

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

    // Item item1 = new Item("�t���E�X", 2350000);
    // Item item2 = new Item("�o�����[", 2970000);
    // Item item3 = new Item("�x���O�����h", 3150000);
    // Item item4 = new Item("�t�H�[���f�B�[Z", 3980000);
    // Item item5 = new Item("�K�j���f", 2620000);

    Item[] itemArry = {
        new Item("�t���E�X", 2350000),     new Item("�o�����[", 2970000),
        new Item("�x���O�����h", 3150000), new Item("�t�H�[���f�B�[Z", 3980000),
        new Item("�K�j���f", 2620000),
    };

    for (Item item : itemArry) {
      shop.add(item);
    }

    // shop.add(item1);
    // shop.add(item2);
    // shop.add(item3);
    // shop.add(item4);
    // shop.add(item5);

    shop.print();

    Customer customer = new Customer("�c��");
    customer.print();

    customer.add(shop, 0); // �t���E�X
    customer.add(shop, 3); // �t�H�[���f�B�[Z
    customer.printMyCart();
  }
}

