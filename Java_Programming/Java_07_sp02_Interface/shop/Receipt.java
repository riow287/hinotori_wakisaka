package shop;

public class Receipt implements FormPrint {
  /**
   * 
   */
  Receipt() { System.out.println("�E���i������󂯎��܂����B"); }
  
  @Override
  public void print() {
    System.out.println(">> �̎����𔭍s");
  }
}