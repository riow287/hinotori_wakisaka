import java.util.Scanner;

public class Constellation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("誕生月を入力してください：");
    int month = sc.nextInt();

    System.out.print("誕生日を入力してください：");
    int day = sc.nextInt();

    String constellation = getConstellation(month, day);

    System.out.println("あなたの星座は" + constellation + "です。");

  }

  public static String getConstellation(int month, int day) {
    String constellation;
    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
      constellation = "牡羊座";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
      constellation = "牡牛座";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
      constellation = "双子座";
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
      constellation = "蟹座";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
      constellation = "獅子座";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
      constellation = "乙女座";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
      constellation = "天秤座";
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
      constellation = "蠍座";
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
      constellation = "射手座";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
      constellation = "山羊座";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
      constellation = "水瓶座";
    } else {
      constellation = "魚座";
    }
    return constellation;
  }
}
