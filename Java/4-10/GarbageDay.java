public class GarbageDay {
  public static void main(String[] args) {
    String week = "�y";
    String garbageDay;

    switch (week) {
    case "��":
    case "�y":
      garbageDay = "�R���݂̓��ł��B";
      break;
    case "��":
      garbageDay = "�s�R���݂̓��ł��B";
      break;
    case "��":
      garbageDay = "�������݂̓��ł��B";
      break;
    default:
      garbageDay = "���݂̎��W���ł͂���܂���B";
      break;
    }

    System.out.println(week + "�j���́A" + garbageDay);
  }
}
