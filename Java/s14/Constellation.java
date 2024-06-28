import java.util.Scanner;

public class Constellation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("�a��������͂��Ă��������F");
    int month = sc.nextInt();

    System.out.print("�a��������͂��Ă��������F");
    int day = sc.nextInt();

    String constellation = getConstellation(month, day);

    System.out.println("���Ȃ��̐�����" + constellation + "�ł��B");

  }

  public static String getConstellation(int month, int day) {
    String constellation;
    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
      constellation = "���r��";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
      constellation = "������";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
      constellation = "�o�q��";
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
      constellation = "�I��";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
      constellation = "���q��";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
      constellation = "������";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
      constellation = "�V����";
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
      constellation = "嶍�";
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
      constellation = "�ˎ��";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
      constellation = "�R�r��";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
      constellation = "���r��";
    } else {
      constellation = "����";
    }
    return constellation;
  }
}
