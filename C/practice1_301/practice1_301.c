#include <stdio.h>
#define FALSE 0
#define TRUE 1
int getPrice(int pcode);

int main(void) {
  int productCode; /* 商品コード */
  int price;       /* 価格 */

  printf("商品コード => ");
  scanf("%d", &productCode);

#if FALSE
    price = getPrice(productCode);
#else
  price = 1200; 
#endif

  printf("商品コード：%d, 販売価格：%d\n", productCode, price);

  return 0;
}