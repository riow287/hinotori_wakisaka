package sample;

public class LoanableAccount extends SavingAccount {

  /**
   *  �؉z���x�z
   */
  private int overdraftLimit;

  /**
   * �R���X�g���N�^
   * @param name �������`
   * @param balance �c��
   * @param overdraftLimit �؉z���x�z
   */
  public LoanableAccount(String name, int balance, int overdraftLimit) {
    super(name, balance);
    this.overdraftLimit = overdraftLimit;
  }

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
   * �؉z���x�z�𒴂��Ȃ��͈͂ŁA�w�肳�ꂽ���z�������o���܂��B
   * @param amount ���o���z
   * @return ���o���z
   */
  @Override
  int withdraw(int amount) {
    int refund;

    if (getBalance() + overdraftLimit > amount) {
      refund = amount;
      setBalance(getBalance() - amount);
    } else {
      // �w����o���z���؉z���x�z�𒴂��Ă����ꍇ
      System.out.println(
          "���������o�s�F���o��]���z���؉z���x�z�𒴂��Ă��܂�������");
      refund = 0;
    }
    return refund;
  }

  /**
   * ���݂̎c����S�z�����o���܂��B
   * �؉z���z������ꍇ��0��Ԃ��܂��B
   * @return ���o���z
   */
  @Override
  int withdraw() {
    int refund; // ���o���z

    if (getBalance() >= 0) {
      refund = getBalance();
    } else {
      System.out.println(
          "���������o�s�F�؉z���z�����邽�߁A�S�z�����o���@�\�͗��p�ł��܂��񁦁���");
      refund = 0;
    }

    return refund;
  }

  /**
   * ���o�\�c����\������
   */
  @Override
  void checkBalance() {
    super.checkBalance();
    System.out.println("���o�\�c���F" + (getBalance() + overdraftLimit) + "�~");
    showOverdraftLimit();
  }

  /**
   *  �؉z���x�z��\������
   */
  void showOverdraftLimit() {
    System.out.println("�؉z���x�z�F" + overdraftLimit + "�~");
  }
}