public class GarbageDay {
  public static void main(String[] args) {
    String week = "土";
    String garbageDay;

    switch (week) {
    case "水":
    case "土":
      garbageDay = "可燃ごみの日です。";
      break;
    case "月":
      garbageDay = "不燃ごみの日です。";
      break;
    case "木":
      garbageDay = "資源ごみの日です。";
      break;
    default:
      garbageDay = "ごみの収集日ではありません。";
      break;
    }

    System.out.println(week + "曜日は、" + garbageDay);
  }
}
