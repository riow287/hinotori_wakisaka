#include <stdio.h>
#define FALSE 0
#define TRUE 1
int getPrice(int pcode);

int main(void) {
  int productCode; /* ���i�R�[�h */
  int price;       /* ���i */

  printf("���i�R�[�h => ");
  scanf("%d", &productCode);

#if FALSE
    price = getPrice(productCode);
#else
  price = 1200; 
#endif

  printf("���i�R�[�h�F%d, �̔����i�F%d\n", productCode, price);

  return 0;
}