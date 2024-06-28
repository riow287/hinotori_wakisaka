#include <stdio.h>
int funcA(int param);
int main(void) {
  int result;
  /* テストケース01：正常系01 */
  result = funcA(3);
  if (result != 1) {
    printf("テストケース01：failure\n");
  }
  /* テストケース02：正常系02 */
  result = funcA(5);
  if (result != 0) {
    printf("テストケース02：failure\n");
  }
  /* テストケース03：異常系01 */
  result = funcA(0);
  if (result != -1) {
    printf("テストケース03：failure\n");
  }
  printf("テスト完了\n");
  return 0;
}
int funcA(int param) {
  int result;
  if (param == 0) {
    result = -1;
  } else {
    result = 10 % param;
  }
  return result;
}
