import java.util.Scanner;

public class Sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("������5���͂��Ă��������B\n");

    int[] arrNum = new int[5];

    for (int i = 0; i < 5; i++) {
      String str = sc.next();
      int num = Integer.parseInt(str);
      arrNum[i] = num;
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    int idx = 0; // num�̃C���f�b�N�X

    while (idx < 5) { // �ō���5��ɕ����ē��͂ł���

      String str = sc.nextLine(); // ���s�R�[�h�܂ł̒l��ǂݎ��
      String[] arrStr =
          str.split(" "); // String�^�ϐ���.split(��؂蕶��,������);

      for (String numStr : arrStr) {
        if (idx < 5) {
          int num = Integer.parseInt(numStr);
          arrNum[idx] = num;
          idx++;
        }
        if (idx == 5) {
          break;
        }
      }
    }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

  // �o�u���\�[�g
  for (int i = 0; i < arrNum.length - 1; i++) {
    for (int j = 0; j < arrNum.length - 1 - i; j++) {
      if (arrNum[j] > arrNum[j + 1]) {
        int temp = arrNum[j];
        arrNum[j] = arrNum[j + 1];
        arrNum[j + 1] = temp;
      }
    }
  }

  System.out.println();
  System.out.println("���ёւ���");
  for (int i = 0; i < arrNum.length; i++) {
    System.out.print(arrNum[i] + " ");
    // for (int num : arrNum) {
    //   System.out.print(num + " ");
    // }
  }
}
}
// �o�u���\�[�g

// �X�y�[�X�ŋ�؂��Ă�Ƃ��@�΂炷�@�ujava split���\�b�h�v