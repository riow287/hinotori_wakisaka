public class TimeMessage {
  public static void main(String[] args) {
    int time = 18;

    if ((time >= 1) && (time <= 24)) {
      if ((time >= 6) && (time <= 11)) {
        System.out.println(time + " 時 おはよう");
      } else if (time <= 17) {
        System.out.println(time + " 時 こんにちは");
      } else if (time <= 23) {
        System.out.println(time + " 時 こんばんは");
      } else {
        System.out.println(time + " 時 おやすみ");
      }
    }
  }
}
