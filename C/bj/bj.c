/**
    概要：      ブラックジャック
    作成者：    脇坂梨緒
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 構造体定義
typedef struct {
  // 変数宣言
  int number; // カードのナンバー
  int suit;   // カードのスート（1:spade,2:heart,3:diamond,4:club）
} S_CARD;

// 関数のプロトタイプ宣言
void prepareCard(S_CARD arrCardss[]);
void displayCard(S_CARD card);
void shuffleCard(S_CARD arrCards[]);
void drawCard(S_CARD arrCards[], S_CARD arrHands[], int *pCursor,
              int *pCursorHands);
int calculateHands(S_CARD arrHands[], int *pCursorHands);
int playPlayer(S_CARD arrCards[], S_CARD arrHands[], int *pCursor,
               int *pCursorHands);
int playDealer(S_CARD arrCards[], S_CARD arrHandsDealer[], int *pCursor,
               int *pCursorHandDealer);
int judgeBurst(S_CARD arrHands[], int *pCursorHands);
int judgeGame(int sumPlayer, int sumDealer);

// main関数
int main(void) {

  // 変数宣言
  int i;                     // 反復パラメータ
  S_CARD arrCards[52];       // 52枚のカード
  S_CARD arrHands[52];       // プレーヤーの手札
  S_CARD arrHandsDealer[52]; // ディーラーの手札
  int cursor;                // 山札のカーソル
  int cursorHand;            // 手札のカーソル
  int cursorHandDealer;      // ディーラーの手札のカーソル
  int flgBurstPlayer; // プレーヤーのバーストしてるかフラグ
  int flgBurstDealer; // ディーラーのバーストしてるかフラグ
  int sumPlayer;      // プレーヤーの手札の合計
  int sumDealer;      // ディーラーの手札の合計
  int flgContinue;    // 続けるかどうかフラグ
  char strInp[100];   // 続けるかどうかの入力値の入れもの

  // カードを用意する
  prepareCard(arrCards);

  flgContinue = 1;
  while (flgContinue == 1) {

    // カードをシャッフルする
    srand((unsigned int)time(NULL));
    shuffleCard(arrCards);

    // // カードを表示する（テスト）
    // for (i = 0; i < 52; i++) {
    //   displayCard(arrCards[i]);
    // }

    // カードを引く
    cursor = 0;
    cursorHand = 0;
    cursorHandDealer = 0;
    for (i = 0; i < 2; i++) {
      drawCard(arrCards, arrHands, &cursor, &cursorHand);
      drawCard(arrCards, arrHandsDealer, &cursor, &cursorHandDealer);
    }

    // プレーヤーがプレイする
    printf("\n");
    printf("【プレーヤーのターン】\n");
    flgBurstPlayer = playPlayer(arrCards, arrHands, &cursor, &cursorHand);
    // printf("flgBurst: %d\n", flgBurstPlayer); // test
    // バーストした場合
    if (flgBurstPlayer == 1) {
      printf("\n結果：プレーヤーの負け\n");
      printf("プレーヤーの手札のカード:");
      for (i = 0; i < cursorHand; i++) {
        displayCard(arrHands[i]);
      }
    }

    // ディーラーがプレイする
    else {
      printf("\n");
      printf("【ディーラーのターン】\n");
      flgBurstDealer =
          playDealer(arrCards, arrHandsDealer, &cursor, &cursorHandDealer);
      // printf("flgBurst: %d\n", flgBurstDealer); // test
      // バーストした場合
      if (flgBurstDealer == 1) {
        printf("\n結果：プレーヤーの勝ち\n");
        printf("ディーラーの手札のカード:");
        for (i = 0; i < cursorHandDealer; i++) {
          displayCard(arrHandsDealer[i]);
        }
      }

      // バーストしなかった場合の勝敗判定
      else {
        printf("\n結果：");
        sumPlayer = calculateHands(arrHands, &cursorHand);
        sumDealer = calculateHands(arrHandsDealer, &cursorHandDealer);
        judgeGame(sumPlayer, sumDealer);

        printf("\nプレーヤーの手札のカード:");
        for (i = 0; i < cursorHand; i++) {
          displayCard(arrHands[i]);
        }
        printf("\nディーラーの手札のカード:");
        for (i = 0; i < cursorHandDealer; i++) {
          displayCard(arrHandsDealer[i]);
        }
      }
    }

    printf("\n");
    printf("\n続けますか？（y/n）\n");
    scanf("%s", strInp);
    // 入力値のチェック
    if (strInp[0] != 'y') {
      flgContinue = 0;
    }
  }

  // 正常終了
  return 0;
}

/*
    カードを用意する
    arrCards[52]：52枚のカード
*/
void prepareCard(S_CARD arrCards[]) {
  // 変数宣言
  int i; // 反復パラメータ
  int j; // 反復パラメータ
  // スートを扱う
  for (i = 0; i < 4; i++) {
    // 番号を扱う
    for (j = 0; j < 13; j++) {
      arrCards[i * 13 + j].number = (j + 1);
      arrCards[i * 13 + j].suit = (i + 1);
    }
  }
}
/*
    カードを表示する
    ▲：スペード
    ▽：ハート
    ◇：ダイヤ
    ■：クラブ
    フォーマット：[suit number（固定2桁）]
*/
void displayCard(S_CARD card) {
  // スートのマークを設定する
  char mark[4];
  switch (card.suit) {
  case 1:
    strcpy(mark, "▲");
    break;
  case 2:
    strcpy(mark, "▽");
    break;
  case 3:
    strcpy(mark, "◇");
    break;
  default:
    strcpy(mark, "■");
    break;
  }
  //
  printf("[%s", mark);
  if (card.number < 10) {
    printf(" ");
  }
  printf("%d]", card.number);
}

/*
    カードをシャッフルする

*/
void shuffleCard(S_CARD arrCards[]) {
  // 変数宣言
  int i;       // 反復パラメータ
  int randNum; // ランダムに出た値
  S_CARD temp; // 一時的な値の入れもの

  // カードをシャッフルする
  for (i = 0; i < 52; i++) {
    randNum = rand() % 52;
    temp = arrCards[i];
    arrCards[i] = arrCards[randNum];
    arrCards[randNum] = temp;
  }
}

/*
    山札からカードを引く
    arrCards[]　：52枚のカード
    arrHands[]　：手札
    pCursor　：山札のカーソル
    pCursorHands　：手札のカーソル
*/
void drawCard(S_CARD arrCards[], S_CARD arrHands[], int *pCursor,
              int *pCursorHands) {
  arrHands[*pCursorHands] = arrCards[*pCursor];
  (*pCursor)++;
  (*pCursorHands)++;
}

/*
    プレーヤーがプレイする
  戻り値　0:バーストしてない　1:バーストした
*/
int playPlayer(S_CARD arrCards[], S_CARD arrHands[], int *pCursor,
               int *pCursorHands) {
  // 変数宣言
  int flgHit;       // カードを引くフラグ
  char strInp[100]; // プレーヤーがカードを引くかどうかの置きもの
  int i;            // 反復パラメータ

  flgHit = 1;

  while (flgHit == 1) {
    // 手札のカードを表示する
    printf("プレーヤーの手札のカード:");
    for (i = 0; i < *pCursorHands; i++) {
      displayCard(arrHands[i]);
    }

    // 手札の合計値を出す
    printf("\n手札のカードの合計: %d\n",
           calculateHands(arrHands, pCursorHands));

    // プレーヤーのバースト判定
    if (judgeBurst(arrHands, pCursorHands)) {
      printf("プレーヤーがバーストしました\n");
      return 1;
    }

    // ユーザー入力受付
    printf("カードを引きますか？（y/n）\n");
    scanf("%s", strInp);

    // 入力値のチェック
    if (strInp[0] != 'y') {
      flgHit = 0;
      printf("カードを引きませんでした\n");
    } else {
      printf("カードを引きました\n");
      drawCard(arrCards, arrHands, pCursor, pCursorHands);
    }
  }
  return 0;
}

/*
    ディーラーがプレイする
    戻り値　0:バーストしてない　1:バーストした
*/
int playDealer(S_CARD arrCards[], S_CARD arrHandsDealer[], int *pCursor,
               int *pCursorHandDealer) {
  // 変数宣言
  int flgHit; // カードを引くフラグ
  int tmpSum; // ディーラーの手札の合計値の置きもの
  int i;      // 反復パラメータ

  flgHit = 1;

  while (flgHit == 1) {
    // 手札のカードを表示する
    printf("ディーラーの手札のカード:");
    for (i = 0; i < *pCursorHandDealer; i++) {
      displayCard(arrHandsDealer[i]);
    }

    // 手札の合計値を出す
    printf("\nディーラーの手札の合計: %d\n",
           calculateHands(arrHandsDealer, pCursorHandDealer));

    // ディーラーのバースト判定
    if (judgeBurst(arrHandsDealer, pCursorHandDealer)) {
      printf("ディーラーがバーストしました\n");
      return 1;
    }

    tmpSum = calculateHands(arrHandsDealer, pCursorHandDealer);

    // 値のチェック
    if (tmpSum >= 17) {
      flgHit = 0;
      printf("カードを引きませんでした\n");
    } else {
      printf("カードを引きました\n");
      drawCard(arrCards, arrHandsDealer, pCursor, pCursorHandDealer);
    }
  }
  return 0;
}

/*
    手札の合計値を出す
    arrHands[]　：手札
    pCursorHands　：手札のカーソル
*/
int calculateHands(S_CARD arrHands[], int *pCursorHands) {
  // 変数宣言
  int i;        // 反復パラメータ
  int sum;      // 手札の合計値
  int flgA;     // 手札にAがあるフラグ
  int tmpHands; // 一時的にカードの値を入れる

  sum = 0;
  flgA = 0;

  for (i = 0; i < *pCursorHands; i++) {
    if (arrHands[i].number > 10) {
      tmpHands = 10;
    } else {
      tmpHands = arrHands[i].number;
    }
    sum += tmpHands;

    if (arrHands[i].number == 1) {
      flgA = 1;
    }
  }

  if (flgA == 1) {
    if (sum <= 11) {
      sum += 10;
    }
  }

  return sum;
}

/*
    バースト判定
    arrHands[]　：手札
    pCursorHands　：手札のカーソル
    戻り値　0:バーストしてない　1:バーストした
*/
int judgeBurst(S_CARD arrHands[], int *pCursorHands) {
  // 変数宣言
  int flgBurst; // バーストしてるかフラグ
  int tmpSum;   // 手札の合計値の入れもの

  flgBurst = 0;
  tmpSum = calculateHands(arrHands, pCursorHands);

  if (tmpSum > 21) {
    flgBurst = 1;
  }

  return flgBurst;
}

/*
    勝敗判定
    戻り値　0:プレーヤーの勝ち
          　1:ディーラーの勝ち
            2:引き分け
*/
int judgeGame(int sumPlayer, int sumDealer) {
  if (sumPlayer > sumDealer) {
    printf("プレーヤーの勝ち");
    return 0;
  } else if (sumPlayer < sumDealer) {
    printf("ディーラーの勝ち");
    return 1;
  } else {
    printf("引き分け");
    return 2;
  }
}