#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {

  // �ϐ��錾
  FILE *fp;      // �t�@�C���|�C���^
  char str[200]; // �t�@�C������ǂݍ��ރT�C�Y

  // �R�}���h���C�������G���[
  if (argc < 2) {
    printf("�R�}���h���C�������G���[�F���̓t�@�C�������w�肵�Ă�������\n");
    exit(1);
  }

  // �t�@�C���I�[�v�����s
  fp = fopen(argv[1], "r");
  if (fp == NULL) {
    printf("�t�@�C���I�[�v���Ɏ��s���܂����i%s�j\n", argv[1]);
    exit(1);
  }

  // �t�@�C������1�s���ǂݍ��݁A���v�l��\������
  while (fgets(str, sizeof(str), fp) != NULL) {
    printf("%s", str);
  }
  // �߂�l
  fclose(fp);
  return 0;
}