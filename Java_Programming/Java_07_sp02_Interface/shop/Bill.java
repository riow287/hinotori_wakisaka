package shop;

public class Bill implements FormPrint {
  /**
   *
   */
  Bill() { System.out.println("�E���i����̐������s���܂����B"); }

  @Override
  public void print() {
    System.out.println(">> �������𔭍s");
  }
}
