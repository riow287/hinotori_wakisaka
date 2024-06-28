#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {

  // 変数宣言
  FILE *fp;      // ファイルポインタ
  char str[200]; // ファイルから読み込むサイズ

  // コマンドライン引数エラー
  if (argc < 2) {
    printf("コマンドライン引数エラー：入力ファイル名を指定してください\n");
    exit(1);
  }

  // ファイルオープン失敗
  fp = fopen(argv[1], "r");
  if (fp == NULL) {
    printf("ファイルオープンに失敗しました（%s）\n", argv[1]);
    exit(1);
  }

  // ファイルから1行ずつ読み込み、合計値を表示する
  while (fgets(str, sizeof(str), fp) != NULL) {
    printf("%s", str);
  }
  // 戻り値
  fclose(fp);
  return 0;
}