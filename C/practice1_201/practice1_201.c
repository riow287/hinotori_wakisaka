#include <stdio.h>
#include <stdlib.h>

int value = 10;

void func(void) { 
    printf("(funcで表示) value = %d\n", value); 
}

int main(void) {
  func();
  printf("(mainで表示) value = %d\n", value);

  return 0;
}
