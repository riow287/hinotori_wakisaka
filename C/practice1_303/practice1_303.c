#include <stdio.h>
#include <stdlib.h>

int main(void) {

    char *p;
    int max = 50;

    p = malloc(sizeof(char) * max + 1);

    printf("������i%d�����j=> ", max);
    fgets(p, max, stdin);

    printf("���͂���������F%s", p);

    free(p);
    return 0;
}
