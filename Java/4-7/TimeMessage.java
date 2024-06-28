public class TimeMessage {
  public static void main(String[] args) {
    int time = 18;

    if ((time >= 1) && (time <= 24)) {
      if ((time >= 6) && (time <= 11)) {
        System.out.println(time + " Žž ‚¨‚Í‚æ‚¤");
      } else if (time <= 17) {
        System.out.println(time + " Žž ‚±‚ñ‚É‚¿‚Í");
      } else if (time <= 23) {
        System.out.println(time + " Žž ‚±‚ñ‚Î‚ñ‚Í");
      } else {
        System.out.println(time + " Žž ‚¨‚â‚·‚Ý");
      }
    }
  }
}
