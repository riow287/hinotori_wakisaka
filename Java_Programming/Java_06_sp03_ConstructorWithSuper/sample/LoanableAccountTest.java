package sample;
/**
 * LoanableAccount�̃e�X�g�N���X�ł��B
 * @author name
 */

public class LoanableAccountTest {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
   */
  public static void main(String[] args) {
    // �C���X�^���X�����ăC���X�^���X�ϐ�la�ɑ��
    LoanableAccount la = new LoanableAccount("�R�c���Y", 100000, 2000);
    la.checkBalance();
    la.showOverdraftLimit();
  }
}