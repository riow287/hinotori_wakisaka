#include <stdio.h>
#include <stdlib.h>

int main(void) {

  // �ϐ��錾
  FILE *fp;         // �t�@�C���|�C���^
  char str[200];    // �t�@�C������ǂݍ��ރT�C�Y
  int num;          // �ǂݍ��񂾐��l
  int sum;          // ���v�l

  // �t�@�C�����J���Ȃ������Ƃ��ɕ\������
  fp = fopen("numlist.txt", "r");
  if (fp == NULL) {
    printf("file open failed!\n");
    exit(1);
  }

  // �t�@�C������1�s���ǂݍ��݁A���v�l��\������
  sum = 0;
  while (fgets(str, 200, fp) != NULL) {
    num = atoi(str);
    sum += num;
    printf("�ǂݍ��񂾐��l�F %d, ���v�l�F %d\n", num, sum);
  }

  // �߂�l
  fclose(fp);
  return 0;
}
