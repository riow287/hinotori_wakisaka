public class Triangle1 {
  public static void main(String[] args) {
    double base = Double.parseDouble(args[0]);
    double height = Double.parseDouble(args[1]);

    double area = base * height / 2;

    System.out.println("底辺" + base + "、高さ" + height + "の三角形の面積：" + area);
  }
}
