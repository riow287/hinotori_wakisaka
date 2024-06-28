package shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * �J�[�g�N���X
 * @author name
 */
public class Cart {

  /**
   * ���i���X�g
   */
  private List<Item> listItem = new ArrayList<>();

  /**
   * ���i��ǉ�����
   * @param item ���i
   */
  public void add(Item item) { listItem.add(item); }

  /**
   * ����̏��i����������
   * @param itemNo ���i�ԍ�
   */
  public void remove(int itemNo) {
    if (itemNo >= 0 && itemNo < listItem.size()) {
      listItem.remove(itemNo);
    } 
    else {
      System.out.println(
          "�w�肳�ꂽ���i�ԍ��ɊY�����鏤�i�̓J�[�g�ɂ���܂���B");
    }
  }

  /**
   * �J�[�g���̂��ׂĂ̏��i����������
   */
  public void clear() { listItem.clear(); }

  /**
   * ���ׂĂ̏��i�̍��v���i���擾����
   */
  public int getTotalPrice() {
    int totalPrice = 0;
    for (Item item : listItem) {
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }

  /**
   * �J�[�g���̏���\������
   */
  public void print() {
    System.out.println("�y�J�[�g���̏��i�z");

    if (listItem.size() == 0) {
      System.out.println("�J�[�g�ɏ��i�������Ă��܂���B");
    }

    else {
      for (int i = 0; i < listItem.size(); i++) {
        System.out.print(i + " "); // �C���f�b�N�X�ԍ�
        listItem.get(i).print();   // ���i�Ɖ��i
      }
      System.out.println("�J�[�g���̏��i�̍��v���i�F" + getTotalPrice() + "�~");
    }
  }
}
