#include <stdio.h>

// ���p�̕ϐ��̒�`
union UN_A {
  char a[4];
  float f;
  int n;
};

int main(void) {
  union UN_A data;

  data.a[0] = 'A';
  data.a[1] = 'B';
  data.a[2] = 'C';

  printf("�z��i3�����j => %s\n", data.a);
  printf("�����o�ia�j = %s\n", data.a);

  data.f = 3.14;
  printf("���� => %f\n", data.f);
  printf("�����o�if�j = %f\n", data.f);
  printf("�z��i3�����j => %s\n", data.a);

  data.n = 100;
  printf("���� => %d\n", data.n);
  printf("�����o(n) = %d\n", data.n);
  printf("�z��i3�����j => %s\n", data.a);

  return 0;
}