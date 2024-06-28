#include <stdio.h>
#include <stdlib.h>

int main(void) {

    char *p;
    int max = 50;

    p = malloc(sizeof(char) * max + 1);

    printf("•¶š—ñi%d•¶šj=> ", max);
    fgets(p, max, stdin);

    printf("“ü—Í‚µ‚½•¶š—ñF%s", p);

    free(p);
    return 0;
}
