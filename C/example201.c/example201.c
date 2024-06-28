#include <stdio.h>
int n[4] = {10, 20, 30, 40};
void reverse(void);
int main(void) {
  int i;
  reverse();
  for (i = 0; i < 4; i++) {
    printf("n[%d] : %d\n", i, n[i]);
  }
  return 0;
}
