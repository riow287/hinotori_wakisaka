// package java.s04;
public class MaxTest {

  public static int max(int[] arr) {
    int max = arr[0];
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }

  public static void main(String[] args) {
    
    int[] arr = {17, 68, 14, 55, 70, 12, 21, 63, 88, 50};

    System.out.print("配列：");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    
    int max = max(arr);
    System.out.println("\n配列の最大値：" + max);
  }
}
