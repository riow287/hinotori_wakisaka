#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int num, i, *p;
  printf("数値を何回入力しますか？ => ");
  scanf("%d", &num);
  p = malloc(sizeof(int) * num);
  for (i = 0; i < num; i++) {
    printf("%d番目の数値を入力してください=> ", i + 1);
    scanf("%d", &p[i]);
  }
  free(p);
  return 0;
}