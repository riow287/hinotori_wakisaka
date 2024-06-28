package shop;

public class Receipt implements FormPrint {
  /**
   * 
   */
  Receipt() { System.out.println("・商品代金を受け取りました。"); }
  
  @Override
  public void print() {
    System.out.println(">> 領収書を発行");
  }
}