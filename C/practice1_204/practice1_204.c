#include <stdio.h>

enum BOOL {
  TRUE, /* ^ */
  FALSE /* ‹U */
};

int main(void) {
  enum BOOL flagOdd = FALSE; // FALSE:‹ô” TRUE:Šï”
  int num;

  printf("”’l => ");
  scanf("%d", &num);

  if (num % 2 == 1) {
    flagOdd = TRUE;
  }

  if (flagOdd == TRUE) {
    printf("%d‚ÍŠï”‚Å‚·\n", num);
  }

  printf("%d", TRUE);
  return 0;
}
