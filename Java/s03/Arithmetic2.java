// package java.s03;
public class Arithmetic2 {

// int firstTerm    ：初項
// int commonDifference  ：公差
// int numberOfTerms    ：項数
// progression ：等差数列

  public static int[] getProgression(int firstTerm, int commonDifference,
                                     int numberOfTerms) {
    int[] progression = new int[numberOfTerms];

    for (int i = 0; i < numberOfTerms; i++) {
      progression[i] = firstTerm + i * commonDifference;
    }

    return progression;
  }

  public static void main(String[] args) {
    
    int firstTerm = Integer.parseInt(args[0]);
    int commonDifference = Integer.parseInt(args[1]);
    int numberOfTerms = Integer.parseInt(args[2]);

    System.out.println("初項 = " + firstTerm + "，公差 = " + commonDifference + "，項数 = " + numberOfTerms);

    int[] progression = getProgression(firstTerm, commonDifference, numberOfTerms);

    System.out.print("等差数列：");
    for (int i = 0; i < progression.length; i++) {
      System.out.print(progression[i] + " ");
    }
  }
}
