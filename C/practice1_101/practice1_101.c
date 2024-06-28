#include <stdio.h>
#include <stdlib.h>

int main(void) {

  // 変数宣言
  FILE *fp;         // ファイルポインタ
  char str[200];    // ファイルから読み込むサイズ
  int num;          // 読み込んだ数値
  int sum;          // 合計値

  // ファイルが開けなかったときに表示する
  fp = fopen("numlist.txt", "r");
  if (fp == NULL) {
    printf("file open failed!\n");
    exit(1);
  }

  // ファイルから1行ずつ読み込み、合計値を表示する
  sum = 0;
  while (fgets(str, 200, fp) != NULL) {
    num = atoi(str);
    sum += num;
    printf("読み込んだ数値： %d, 合計値： %d\n", num, sum);
  }

  // 戻り値
  fclose(fp);
  return 0;
}
