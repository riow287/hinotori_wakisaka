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

    // Item[] itemArry = {
    //   new Item("�t���E�X", 2350000),
    //   new Item("�o�����[", 2970000),
    //   new Item("�x���O�����h", 3150000),
    //   new Item("�t�H�[���f�B�[Z", 3980000),
    //   new Item("�K�j���f", 2620000),
    // };
  
    // for (Item item : itemArry) {
    //   shop.add(item);
    // }

    shop.add(new Item("�t���E�X", 2350000));
    shop.add(new Item("�o�����[", 2970000));
    shop.add(new Item("�x���O�����h", 3150000));
    shop.add(new Item("�t�H�[���f�B�[Z", 3980000));
    shop.add(new Item("�K�j���f", 2620000));

    shop.print();
  }
}
