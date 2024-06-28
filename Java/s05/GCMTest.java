public class GCMTest {

  public static int getGcm(int num1, int num2) {
    int dev = num1 < num2 ? num1 : num2;
    // if (num1 < num2) {
    //   dev = num1;
    // } else {
    //   dev = num2;
    // }

    while (dev >= 1) {
      if (num1 % dev == 0 && num2 % dev == 0) {
        break;
      }
      dev --;
    }
    return dev;
  }

  public static void main(String[] args) {
    int num1;
    int num2;

    num1 = 3108;
    num2 = 1665;

    int gcm = getGcm(num1, num2);

    System.out.println(num1 + " ‚Æ " + num2 + " ‚ÌÅ‘åŒö–ñ”F" + gcm);
  }
}
