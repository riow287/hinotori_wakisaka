#include <stdio.h>

enum BOOL {
  TRUE, /* �^ */
  FALSE /* �U */
};

int main(void) {
  enum BOOL flagOdd = FALSE; // FALSE:���� TRUE:�
  int num;

  printf("���l => ");
  scanf("%d", &num);

  if (num % 2 == 1) {
    flagOdd = TRUE;
  }

  if (flagOdd == TRUE) {
    printf("%d�͊�ł�\n", num);
  }

  printf("%d", TRUE);
  return 0;
}
