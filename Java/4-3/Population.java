public class Population {
  public static void main(String[] args) {
    double Under65 = 73.281;
    double Over65 = 26.719;

    System.out.println("65歳未満の人口：" + Under65 + " 万人");
    System.out.println("65歳以上の人口：" + Over65 + " 万人");

    System.out.println("65歳以上の人口の割合：" + (Over65 / (Under65 + Over65)) * 100 + "%");
  }
}
