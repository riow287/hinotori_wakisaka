#include <stdio.h>
#include <stdlib.h>

int main(void) {
  // 変数宣言
  FILE *fp;       // ファイルポインタ
  char *str[10];  // 文字列配列
  int i;          // 反復パラメータ
  int j;          // 反復パラメータ

  fp = fopen("multiplication.txt", "w");

  // ファイルが開けなかったときに表示する
  if (fp == NULL) {
    printf("file open failed!\n");
    exit(1);
  }

  // 九九表をテキストファイルに出力する
  for (i = 1; i <= 9; i++) {
    fprintf(fp, "%dの段：", i);
    for (j = 1; j <= 9; j++) {
      fprintf(fp, "%2d", i * j);
      if(j <= 8){
        fprintf(fp, ",");
      }
    }
    fprintf(fp, "\n");
  }

  // 戻り値
  fclose(fp);
  return 0;
}
