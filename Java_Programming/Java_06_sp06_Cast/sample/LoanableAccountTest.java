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
    
    la.withdraw(30000);
    la.checkBalance();

    SavingAccount sa = la; // �A�b�v�L���X�g
    la = (LoanableAccount)sa; // �_�E���L���X�g
  }
}