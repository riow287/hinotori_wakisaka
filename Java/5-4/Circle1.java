import java.util.Scanner;
public class Circle1 {

  public static double getPi() {
    return Math.PI;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("���a�F");
    double r =  sc.nextInt();
    sc.close();

    double pi = getPi();
    double area = (r * r * pi);

    System.out.println("���a" + r + "�̉~�̖ʐρF" + area);
  }
}
