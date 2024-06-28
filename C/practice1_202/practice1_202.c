#include <stdio.h>

int value_a = 10;

void func(void);

int main(void) {
    func();
    func();

    return 0;
}

void func(void) {
    static int value_b = 10;
    int value_c = 10;

    value_a ++;
    value_b ++;
    value_c ++;

    printf("value_a = %d\n", value_a);
    printf("value_b = %d\n", value_b);
    printf("value_c = %d\n", value_c);
}

