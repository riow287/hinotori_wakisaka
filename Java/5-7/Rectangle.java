public class Rectangle {
  public static void main(String[] args) {
    int width = Integer.parseInt(args[0]);
    int height = Integer.parseInt(args[1]);

    int area = height * width;

    System.out.println("幅" + width + "、高さ" + height + "の長方形の面積：" + area);
  }
}
