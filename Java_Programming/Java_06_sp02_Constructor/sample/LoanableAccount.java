package sample;

public class LoanableAccount extends SavingAccount {

  /**
   *  �؉z���x�z
   */
  private int overdraftLimit;

  /**
   * �R���X�g���N�^
   */
  public LoanableAccount() {}

  /**
   * overdraftLimt�̒l��Ԃ�
   * @return overdraftLimit �؉z���x�z
   */
  public int getOverdraftLimit() { return overdraftLimit; }

  /**
   * overdraftLimit�̒l��ݒ�
   * @param overdraftLimit �؉z���x�z
   */
  public void setOverdraftLimit(int overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  /**
   *  �؉z���x�z��\������
   */
  void showOverdraftLimit() {
    System.out.println("�؉z���x�z�F" + overdraftLimit + "�~");
  }
}