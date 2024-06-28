#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int num, i, *p;
  printf("”’l‚ð‰½‰ñ“ü—Í‚µ‚Ü‚·‚©H => ");
  scanf("%d", &num);
  p = malloc(sizeof(int) * num);
  for (i = 0; i < num; i++) {
    printf("%d”Ô–Ú‚Ì”’l‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢=> ", i + 1);
    scanf("%d", &p[i]);
  }
  free(p);
  return 0;
}