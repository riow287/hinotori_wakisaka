// package java.s08;
public class Calendar {
  public static void main(String[] args) {

    int month = Integer.parseInt(args[0]);

    if (month < 1 || month > 12) {
    } else {

      System.out.println(month + "ŒƒJƒŒƒ“ƒ_[");
      System.out.printf("“ú Œ ‰Î … –Ø ‹à “y\n");

      int days;

      if (month == 2) {
        days = 28;
      } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        days = 30; // ¼Œü‚­m
      } else {
        days = 31;
      }

      int week = 0;
      for (int i = 1; i <= days; i++) {

        System.out.printf("%2d ", i);
        week++;

        if (week == 7) {
          System.out.println();
          week = 0;
        } 
      }
    }
  }
}
