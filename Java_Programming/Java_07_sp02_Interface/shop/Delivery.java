package shop;

public class Delivery implements FormPrint {
  /**
   * 
   */
  Delivery() { System.out.println("・商品を納品しました。"); }
  
  @Override
  public void print() {
    System.out.println(">> 納品書を発行");
  }
}
