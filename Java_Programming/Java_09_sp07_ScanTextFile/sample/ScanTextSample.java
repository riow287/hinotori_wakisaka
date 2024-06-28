package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Scanner�N���X���g�����T���v���ł��B
 * @author emBex Education
 */
public class ScanTextSample {
  /**
   * ���C�����\�b�h
   * @param args ���̈����͎g�p���Ȃ��B
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