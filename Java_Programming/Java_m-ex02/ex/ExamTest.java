package ex;

/**
 * ExaminationฬeXgNXลท
 * @author name
 */
public class ExamTest {

  /**
   * C\bh
   * @param args ฑฬ๘อgpตศขB
   */
  public static void main(String[] args) {

    Examinee[] examineeAry = {
      new Examinee("RcพY", 70, "A"), 
      new Examinee("lc์", 83, "B"),
      new Examinee("ใcใฤฝ", 48, "A"), 
      new Examinee("ัิq", 55, "A"),
      new Examinee("c๊Y", 62, "B"), 
      new Examinee("s์q", 72, "B"),
      new Examinee("จR", 51, "A"),   
      new Examinee("cธ", 28)
    };
    
    System.out.println("กกก v๎๑ กกก");
    System.out.println("๓ฑาF" + examineeAry.length + " ผ");

    int sumScore = 0;  // ๓ฑาฬscorevl
    for (int i = 0; i < examineeAry.length; i++) {
      sumScore += examineeAry[i].getScore();
    }
    double average = (double) sumScore / examineeAry.length;  // ฝฯ

    System.out.println("MLฑฬฝฯ_" + average + " _");
  }
}
