public class Triangle1 {
  public static void main(String[] args) {
    double base = Double.parseDouble(args[0]);
    double height = Double.parseDouble(args[1]);

    double area = base * height / 2;

    System.out.println("���" + base + "�A����" + height + "�̎O�p�`�̖ʐρF" + area);
  }
}
