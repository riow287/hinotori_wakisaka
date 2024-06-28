package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * List�g�����T���v���ł�
 * @author emBex Education
 */
public class ListSample {

  /**
   * ���C�����\�b�h
   * @param args �R�}���h���C������
   */
  public static void main(String[] args) {

    /* �V����List�I�u�W�F�N�g���쐬*/
    List<String> fruitsList = new ArrayList<String>();

    System.out.println("���X�g�̗v�f���F" + fruitsList.size());

    /* ���X�g�ɗv�f��ǉ�*/
    fruitsList.add("apple");
    fruitsList.add("lemon");
    fruitsList.add("peach");
    fruitsList.add("grape");

    // 
    System.out.println("���X�g�̗v�f���F" + fruitsList.size());

    System.out.println("�C���f�b�N�X3�̗v�f�F" + fruitsList.get(3));

    /* ���X�g���̗v�f��S�ĕ\��*/
    for (int i = 0; i < fruitsList.size(); i++) {
      System.out.print(fruitsList.get(i) + " ");
    }

    System.out.println();

    /* �C���f�b�N�X2�ɗv�f��ǉ�*/
    fruitsList.add(2, "banana");

    /* �C���f�b�N�X1�̗v�f���폜*/
    fruitsList.remove(1);

    /* ���X�g���̗v�f��S�ĕ\��*/
    for (int i = 0; i < fruitsList.size(); i++) {
      System.out.print(fruitsList.get(i) + " ");
    }
  }
}