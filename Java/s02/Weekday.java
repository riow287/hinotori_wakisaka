public class Weekday {

  public static String[] getWeekdayName() {
    String[] weekday = {"Sunday",   "Monday", "Tuesday", "Wednesday",
                        "Thursday", "Friday", "Saturday"};
    return weekday;
  }

  public static void main(String[] args) {

    String[] weekdayName = getWeekdayName();

    System.out.print("—j“úˆê——F");
    for (int i = 0; i < weekdayName.length; i++) {
      System.out.print(weekdayName[i] + ", ");
    }
  }
}
