package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * �V���b�v�N���X
 * @author name
 */
public class Shop {

  /**
   * �V���b�v��
   */
  private String name;

  /**
   * ���i���X�g
   */
  private List<Item> listItem = new ArrayList<Item>();

  /**
   * �w�肳�ꂽ�V���b�v���Ə��i���X�g���g�p���āA
   * �V����Shop�I�u�W�F�N�g���\�z����
   *
   * �i�w�肳�ꂽ���i�ԍ��̏��i���擾����H�H�H�H�j
   * @param name �V���b�v��
   * @param listItem ���i���X�g
   */
  public Shop(String name) {
    this.name = name;
  }

  /**
   * ���i�����i���X�g�ɒǉ�����
   * @param item ���i
   */
  void add(Item item) { listItem.add(item); }

  /**
   * �w�肳�ꂽ���i�ԍ��̏��i���擾����
   * @param itemNo ���i�ԍ�
   */
  Item get(int itemNo) {
    return listItem.get(itemNo);
  }

  /**
   * �V���b�v���Ə��i���X�g�̏���\������
   */
  void print() {
    System.out.println(
        "======================================================");
    System.out.println("��������Ⴂ�܂��I" + name + "�ւ悤�����B");
    System.out.println("�y�戵���i�z");
    for (int i = 0; i < listItem.size(); i++) {
      System.out.print(i + " "); // �C���f�b�N�X�ԍ�
      listItem.get(i).print();   // ���i�Ɖ��i
    }
    System.out.println(
        "======================================================");
  }
}