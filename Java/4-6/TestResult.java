public class TestResult {
    public static void main(String[] args) {
        int score = 0;

        if ((score >= 0) && (score <= 100)) {
            if (score >= 70) {
                System.out.println("合格です！");
            } else {
                System.out.println("不合格です。");
            }
        } else {
            System.out.println("値が不正です。");
        }
    } 
}
