#include <stdio.h>
#include <stdlib.h>

int value = 10;

void func(void) { 
    printf("(func�ŕ\��) value = %d\n", value); 
}

int main(void) {
  func();
  printf("(main�ŕ\��) value = %d\n", value);

  return 0;
}
