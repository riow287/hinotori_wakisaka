package ex;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    List<String> fruitsList = new ArrayList<>();

    fruitsList.add("���");
    fruitsList.add("�΂Ȃ�");
    fruitsList.add("�߂��");
    fruitsList.add("�݂���");
    fruitsList.add("�Ԃǂ�");

    System.out.println("�Q�ڂ̗v�f�F" + fruitsList.get(1));
    System.out.println("�T�ڂ̗v�f�F" + fruitsList.get(4));
    System.out.println();

    System.out.print("���ׂĂ̗v�f��擪����\���F");
    /* ���X�g���̗v�f��S�ĕ\��*/
    // for (int i = 0; i < fruitsList.size(); i++) {
    //   System.out.print(fruitsList.get(i) + " ");
    // }
    for (String str : fruitsList){
      System.out.print(str + " ");
    }

    System.out.println();

    boolean bAddFruit = fruitsList.add("����");
    System.out.println("�v�f��ǉ��i���������true�j�F" + bAddFruit);
    System.out.print("���ׂĂ̗v�f��擪����\���F");
    for (String str : fruitsList){
      System.out.print(str + " ");
    }
    System.out.println();

    System.out.println("�v�f���폜�F" + fruitsList.get(2));
    fruitsList.remove(2);
    System.out.print("���ׂĂ̗v�f��擪����\���F");
    for (String str : fruitsList){
      System.out.print(str + " ");
    }
    System.out.println();

    System.out.println("����̈ʒu�ɗv�f��ǉ�");
    fruitsList.add(1, "�т�");
    System.out.print("���ׂĂ̗v�f��擪����\���F");
    for (String str : fruitsList){
      System.out.print(str + " ");
    }
  }
}
