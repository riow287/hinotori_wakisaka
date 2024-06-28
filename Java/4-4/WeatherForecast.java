public class WeatherForecast {
  public static void main(String[] args) {
    int degree = 27;

    // 予想最高気温が 27℃の場合
    System.out.println("予想最高気温は、" + degree + "℃です。");

    // 予想最高気温が 28℃の場合
    if (degree >= 28) {
      System.out.println("熱中症に警戒してください。");
    }
  }
}
