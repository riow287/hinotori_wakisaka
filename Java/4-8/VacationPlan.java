public class VacationPlan {
  public static void main(String[] args) {
    int number = 2;
    String vacationPlan;

    switch (number) {
    case 1:
      vacationPlan = "�t���x��";
      break;
    case 2:
      vacationPlan = "�Ċ��x��";
      break;
    case 3:
      vacationPlan = "�~���x��";
      break;
    default:
      vacationPlan = "�x�ɗ\��͂���܂���\n";
      break;
    }

    System.out.println("����̋x�ɗ\��F" + vacationPlan);
  }
}

