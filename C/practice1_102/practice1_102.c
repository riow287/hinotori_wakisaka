#include <stdio.h>
#include <stdlib.h>

int main(void) {
  // �ϐ��錾
  FILE *fp;       // �t�@�C���|�C���^
  char *str[10];  // ������z��
  int i;          // �����p�����[�^
  int j;          // �����p�����[�^

  fp = fopen("multiplication.txt", "w");

  // �t�@�C�����J���Ȃ������Ƃ��ɕ\������
  if (fp == NULL) {
    printf("file open failed!\n");
    exit(1);
  }

  // ���\���e�L�X�g�t�@�C���ɏo�͂���
  for (i = 1; i <= 9; i++) {
    fprintf(fp, "%d�̒i�F", i);
    for (j = 1; j <= 9; j++) {
      fprintf(fp, "%2d", i * j);
      if(j <= 8){
        fprintf(fp, ",");
      }
    }
    fprintf(fp, "\n");
  }

  // �߂�l
  fclose(fp);
  return 0;
}
