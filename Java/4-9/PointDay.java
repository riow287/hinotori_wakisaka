public class PointDay {
  public static void main(String[] args) {
    int day = 10;
    String message;

    int ones = day % 10;

    switch (ones) {
    case 3:
      message = "�|�C���g3�{�f�[";
      break;
    case 5:
      message = "�|�C���g5�{�f�[";
      break;
    default:
      message = "�ʏ�|�C���g�f�[";
      break;
    }

    System.out.println("�{���̓��t" + day + "��");
    System.out.println(message);
  }
}
