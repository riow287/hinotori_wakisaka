package shop;

public class Bill implements FormPrint {
  /**
   *
   */
  Bill() { System.out.println("・商品代金の請求を行いました。"); }

  @Override
  public void print() {
    System.out.println(">> 請求書を発行");
  }
}
