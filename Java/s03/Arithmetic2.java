// package java.s03;
public class Arithmetic2 {

// int firstTerm    �F����
// int commonDifference  �F����
// int numberOfTerms    �F����
// progression �F��������

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

    System.out.println("���� = " + firstTerm + "�C���� = " + commonDifference + "�C���� = " + numberOfTerms);

    int[] progression = getProgression(firstTerm, commonDifference, numberOfTerms);

    System.out.print("��������F");
    for (int i = 0; i < progression.length; i++) {
      System.out.print(progression[i] + " ");
    }
  }
}
