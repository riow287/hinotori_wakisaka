package ex;

/**
 * ExaminationΜeXgNXΕ·
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    boolean score = Examination.judge(70);
    if (score) {
      System.out.println("ML±Fi");
    } else {
      System.out.println("ML±Fsi");
    }

    boolean grade = Examination.judge("B");
    if (grade) {
      System.out.println("ΐZ±Fi");
    } else {
      System.out.println("ΐZ±Fsi");
    }

    boolean result = Examination.judge(60, "B");
    if (result) {
      System.out.println("»θFi");
    } else {
      System.out.println("»θFsi");
    }
    result = Examination.judge(59, "B");
    if (result) {
      System.out.println("»θFi");
    } else {
      System.out.println("»θFsi");
    }
  }
}
