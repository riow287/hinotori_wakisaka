#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int num, i, *p;
  printf("���l��������͂��܂����H => ");
  scanf("%d", &num);
  p = malloc(sizeof(int) * num);
  for (i = 0; i < num; i++) {
    printf("%d�Ԗڂ̐��l����͂��Ă�������=> ", i + 1);
    scanf("%d", &p[i]);
  }
  free(p);
  return 0;
}