#include <stdio.h>
#include <stdlib.h>

int main(void) {

    char *p;
    int max = 50;

    p = malloc(sizeof(char) * max + 1);

    printf("文字列（%d文字）=> ", max);
    fgets(p, max, stdin);

    printf("入力した文字列：%s", p);

    free(p);
    return 0;
}
