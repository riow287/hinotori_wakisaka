public class VacationPlan {
  public static void main(String[] args) {
    int number = 2;
    String vacationPlan;

    switch (number) {
    case 1:
      vacationPlan = "春期休暇";
      break;
    case 2:
      vacationPlan = "夏期休暇";
      break;
    case 3:
      vacationPlan = "冬期休暇";
      break;
    default:
      vacationPlan = "休暇予定はありません\n";
      break;
    }

    System.out.println("次回の休暇予定：" + vacationPlan);
  }
}

