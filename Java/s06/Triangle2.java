// package java.s06;

public class Triangle2 {

  public static void drawTriangle(int height) {
    for (int i = 0; i <= height; i++) {

      for (int j = 0; j <= height - i; j++) {
          System.out.print(" ");
      }

      for (int k = 0; k <= i * 2; k++) {
          System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int height = 7;
    drawTriangle(height);
  }
}

//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************