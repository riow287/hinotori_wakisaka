#include <stdio.h>
int funcA(int param);
int main(void) {
  int result;
  /* �e�X�g�P�[�X01�F����n01 */
  result = funcA(3);
  if (result != 1) {
    printf("�e�X�g�P�[�X01�Ffailure\n");
  }
  /* �e�X�g�P�[�X02�F����n02 */
  result = funcA(5);
  if (result != 0) {
    printf("�e�X�g�P�[�X02�Ffailure\n");
  }
  /* �e�X�g�P�[�X03�F�ُ�n01 */
  result = funcA(0);
  if (result != -1) {
    printf("�e�X�g�P�[�X03�Ffailure\n");
  }
  printf("�e�X�g����\n");
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
