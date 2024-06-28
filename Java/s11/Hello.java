import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {

    String str = null;

    // Scannerクラスのオブジェクトを生成
    Scanner sc = new Scanner(System.in);

    System.out.print("名前を入力してください：");

    // キーボードから入力した値をString型変数strに代入
    str = sc.next();

    System.out.println( str + "さん、こんにちは。");

    sc.close();
  }
}
