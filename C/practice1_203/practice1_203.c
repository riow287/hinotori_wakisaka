#include <stdio.h>

// 共用体変数の定義
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

  printf("配列（3文字） => %s\n", data.a);
  printf("メンバ（a） = %s\n", data.a);

  data.f = 3.14;
  printf("実数 => %f\n", data.f);
  printf("メンバ（f） = %f\n", data.f);
  printf("配列（3文字） => %s\n", data.a);

  data.n = 100;
  printf("整数 => %d\n", data.n);
  printf("メンバ(n) = %d\n", data.n);
  printf("配列（3文字） => %s\n", data.a);

  return 0;
}