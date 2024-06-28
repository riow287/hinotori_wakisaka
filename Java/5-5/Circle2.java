public class Circle2 {

  public static double getCircleArea(double r) {
    double pi = 3.14;
    double area = (r * r * pi);
    return area;
  }

  public static void main(String[] args) {
    double r = 3.0;
    double area = getCircleArea(r);

    System.out.println("”¼Œa" + r + "‚Ì‰~‚Ì–ÊÏF" + area);
  }
}
