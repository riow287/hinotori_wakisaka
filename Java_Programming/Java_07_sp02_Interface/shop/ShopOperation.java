package shop;

public class ShopOperation {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ�
   */
  public static void main(String[] args) {

    System.out.println("���{���̋Ɩ����J�n���܂��B");
    
    Purchase purchase = new Purchase(); // �d����
    Delivery delivery = new Delivery(); // �[�i
    Bill bill = new Bill();             // ����
    Reserve reserve = new Reserve();    // �\���t
    Receipt receipt = new Receipt();    // ������
    
    System.out.println("\n���{��������������̂����A�ڋq�֓n�����[��������܂��B");
    FormPrint[] form = {delivery, bill, receipt};
    for (int i = 0; i < form.length; i++) {
      form[i].print();
    }
  }
}