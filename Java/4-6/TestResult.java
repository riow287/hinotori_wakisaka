public class TestResult {
    public static void main(String[] args) {
        int score = 0;

        if ((score >= 0) && (score <= 100)) {
            if (score >= 70) {
                System.out.println("���i�ł��I");
            } else {
                System.out.println("�s���i�ł��B");
            }
        } else {
            System.out.println("�l���s���ł��B");
        }
    } 
}
