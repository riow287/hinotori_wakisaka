public class Population {
  public static void main(String[] args) {
    double Under65 = 73.281;
    double Over65 = 26.719;

    System.out.println("65�Ζ����̐l���F" + Under65 + " ���l");
    System.out.println("65�Έȏ�̐l���F" + Over65 + " ���l");

    System.out.println("65�Έȏ�̐l���̊����F" + (Over65 / (Under65 + Over65)) * 100 + "%");
  }
}
