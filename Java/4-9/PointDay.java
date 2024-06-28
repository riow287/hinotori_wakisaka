public class PointDay {
  public static void main(String[] args) {
    int day = 10;
    String message;

    int ones = day % 10;

    switch (ones) {
    case 3:
      message = "ポイント3倍デー";
      break;
    case 5:
      message = "ポイント5倍デー";
      break;
    default:
      message = "通常ポイントデー";
      break;
    }

    System.out.println("本日の日付" + day + "日");
    System.out.println(message);
  }
}
