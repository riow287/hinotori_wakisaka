package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Scannerクラスを使ったサンプルです。
 * @author emBex Education
 */
public class ScanTextSample {
  /**
   * メインメソッド
   * @param args この引数は使用しない。
   */
  public static void main(String[] args) {

    File file = new File("sample.txt");

    try (Scanner scan = new Scanner(file)) {
      while (scan.hasNext()) {
        System.out.println(scan.next());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}