package ex;
/**
 * Examinationのテストクラスです
 * @author name
 */
public class ExamTest {

  public static void main(String[] args) {

    boolean bPass1 = Examination.judge(70);
    boolean bPass2 = Examination.judge(69);

    if (bPass1) {
      System.out.println("筆記試験：合格");
    } else {
      System.out.println("筆記試験：不合格");
    }

    if (bPass2) {
      System.out.println("筆記試験：合格");
    } else {
      System.out.println("筆記試験：不合格");
    }
  }
}
