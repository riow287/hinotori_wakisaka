package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * �g��for�����g�����T���v���ł��B
 * @author emBex Education
 */
public class ForSample {
  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    /* List�I�u�W�F�N�g�𐶐����A�g��for���ŗv�f��\������*/
    List<String> fruitsList = new ArrayList<String>();
    fruitsList.add("apple");
    fruitsList.add("lemon");
    fruitsList.add("peach");
    fruitsList.add("grape");
    fruitsList.add("banana");

    // �i���o�����v�f��������ϐ��F�f�[�^�̏W���j
    for (String str : fruitsList) {
      System.out.println(str);
    }

    /* �z��𐶐����A�g��for���ŗv�f��\������*/
    int[] intArray = {100, 200, 300, 400, 500};

    for (int i : intArray) {
      System.out.println(i);
    }
  }
}