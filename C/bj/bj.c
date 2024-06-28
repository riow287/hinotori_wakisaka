/**
    �T�v�F      �u���b�N�W���b�N
    �쐬�ҁF    �e�◜��
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// �\���̒�`
typedef struct {
  // �ϐ��錾
  int number; // �J�[�h�̃i���o�[
  int suit;   // �J�[�h�̃X�[�g�i1:spade,2:heart,3:diamond,4:club�j
} S_CARD;

// �֐��̃v���g�^�C�v�錾
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

// main�֐�
int main(void) {

  // �ϐ��錾
  int i;                     // �����p�����[�^
  S_CARD arrCards[52];       // 52���̃J�[�h
  S_CARD arrHands[52];       // �v���[���[�̎�D
  S_CARD arrHandsDealer[52]; // �f�B�[���[�̎�D
  int cursor;                // �R�D�̃J�[�\��
  int cursorHand;            // ��D�̃J�[�\��
  int cursorHandDealer;      // �f�B�[���[�̎�D�̃J�[�\��
  int flgBurstPlayer; // �v���[���[�̃o�[�X�g���Ă邩�t���O
  int flgBurstDealer; // �f�B�[���[�̃o�[�X�g���Ă邩�t���O
  int sumPlayer;      // �v���[���[�̎�D�̍��v
  int sumDealer;      // �f�B�[���[�̎�D�̍��v
  int flgContinue;    // �����邩�ǂ����t���O
  char strInp[100];   // �����邩�ǂ����̓��͒l�̓������

  // �J�[�h��p�ӂ���
  prepareCard(arrCards);

  flgContinue = 1;
  while (flgContinue == 1) {

    // �J�[�h���V���b�t������
    srand((unsigned int)time(NULL));
    shuffleCard(arrCards);

    // // �J�[�h��\������i�e�X�g�j
    // for (i = 0; i < 52; i++) {
    //   displayCard(arrCards[i]);
    // }

    // �J�[�h������
    cursor = 0;
    cursorHand = 0;
    cursorHandDealer = 0;
    for (i = 0; i < 2; i++) {
      drawCard(arrCards, arrHands, &cursor, &cursorHand);
      drawCard(arrCards, arrHandsDealer, &cursor, &cursorHandDealer);
    }

    // �v���[���[���v���C����
    printf("\n");
    printf("�y�v���[���[�̃^�[���z\n");
    flgBurstPlayer = playPlayer(arrCards, arrHands, &cursor, &cursorHand);
    // printf("flgBurst: %d\n", flgBurstPlayer); // test
    // �o�[�X�g�����ꍇ
    if (flgBurstPlayer == 1) {
      printf("\n���ʁF�v���[���[�̕���\n");
      printf("�v���[���[�̎�D�̃J�[�h:");
      for (i = 0; i < cursorHand; i++) {
        displayCard(arrHands[i]);
      }
    }

    // �f�B�[���[���v���C����
    else {
      printf("\n");
      printf("�y�f�B�[���[�̃^�[���z\n");
      flgBurstDealer =
          playDealer(arrCards, arrHandsDealer, &cursor, &cursorHandDealer);
      // printf("flgBurst: %d\n", flgBurstDealer); // test
      // �o�[�X�g�����ꍇ
      if (flgBurstDealer == 1) {
        printf("\n���ʁF�v���[���[�̏���\n");
        printf("�f�B�[���[�̎�D�̃J�[�h:");
        for (i = 0; i < cursorHandDealer; i++) {
          displayCard(arrHandsDealer[i]);
        }
      }

      // �o�[�X�g���Ȃ������ꍇ�̏��s����
      else {
        printf("\n���ʁF");
        sumPlayer = calculateHands(arrHands, &cursorHand);
        sumDealer = calculateHands(arrHandsDealer, &cursorHandDealer);
        judgeGame(sumPlayer, sumDealer);

        printf("\n�v���[���[�̎�D�̃J�[�h:");
        for (i = 0; i < cursorHand; i++) {
          displayCard(arrHands[i]);
        }
        printf("\n�f�B�[���[�̎�D�̃J�[�h:");
        for (i = 0; i < cursorHandDealer; i++) {
          displayCard(arrHandsDealer[i]);
        }
      }
    }

    printf("\n");
    printf("\n�����܂����H�iy/n�j\n");
    scanf("%s", strInp);
    // ���͒l�̃`�F�b�N
    if (strInp[0] != 'y') {
      flgContinue = 0;
    }
  }

  // ����I��
  return 0;
}

/*
    �J�[�h��p�ӂ���
    arrCards[52]�F52���̃J�[�h
*/
void prepareCard(S_CARD arrCards[]) {
  // �ϐ��錾
  int i; // �����p�����[�^
  int j; // �����p�����[�^
  // �X�[�g������
  for (i = 0; i < 4; i++) {
    // �ԍ�������
    for (j = 0; j < 13; j++) {
      arrCards[i * 13 + j].number = (j + 1);
      arrCards[i * 13 + j].suit = (i + 1);
    }
  }
}
/*
    �J�[�h��\������
    ���F�X�y�[�h
    ���F�n�[�g
    ���F�_�C��
    ���F�N���u
    �t�H�[�}�b�g�F[suit number�i�Œ�2���j]
*/
void displayCard(S_CARD card) {
  // �X�[�g�̃}�[�N��ݒ肷��
  char mark[4];
  switch (card.suit) {
  case 1:
    strcpy(mark, "��");
    break;
  case 2:
    strcpy(mark, "��");
    break;
  case 3:
    strcpy(mark, "��");
    break;
  default:
    strcpy(mark, "��");
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
    �J�[�h���V���b�t������

*/
void shuffleCard(S_CARD arrCards[]) {
  // �ϐ��錾
  int i;       // �����p�����[�^
  int randNum; // �����_���ɏo���l
  S_CARD temp; // �ꎞ�I�Ȓl�̓������

  // �J�[�h���V���b�t������
  for (i = 0; i < 52; i++) {
    randNum = rand() % 52;
    temp = arrCards[i];
    arrCards[i] = arrCards[randNum];
    arrCards[randNum] = temp;
  }
}

/*
    �R�D����J�[�h������
    arrCards[]�@�F52���̃J�[�h
    arrHands[]�@�F��D
    pCursor�@�F�R�D�̃J�[�\��
    pCursorHands�@�F��D�̃J�[�\��
*/
void drawCard(S_CARD arrCards[], S_CARD arrHands[], int *pCursor,
              int *pCursorHands) {
  arrHands[*pCursorHands] = arrCards[*pCursor];
  (*pCursor)++;
  (*pCursorHands)++;
}

/*
    �v���[���[���v���C����
  �߂�l�@0:�o�[�X�g���ĂȂ��@1:�o�[�X�g����
*/
int playPlayer(S_CARD arrCards[], S_CARD arrHands[], int *pCursor,
               int *pCursorHands) {
  // �ϐ��錾
  int flgHit;       // �J�[�h�������t���O
  char strInp[100]; // �v���[���[���J�[�h���������ǂ����̒u������
  int i;            // �����p�����[�^

  flgHit = 1;

  while (flgHit == 1) {
    // ��D�̃J�[�h��\������
    printf("�v���[���[�̎�D�̃J�[�h:");
    for (i = 0; i < *pCursorHands; i++) {
      displayCard(arrHands[i]);
    }

    // ��D�̍��v�l���o��
    printf("\n��D�̃J�[�h�̍��v: %d\n",
           calculateHands(arrHands, pCursorHands));

    // �v���[���[�̃o�[�X�g����
    if (judgeBurst(arrHands, pCursorHands)) {
      printf("�v���[���[���o�[�X�g���܂���\n");
      return 1;
    }

    // ���[�U�[���͎�t
    printf("�J�[�h�������܂����H�iy/n�j\n");
    scanf("%s", strInp);

    // ���͒l�̃`�F�b�N
    if (strInp[0] != 'y') {
      flgHit = 0;
      printf("�J�[�h�������܂���ł���\n");
    } else {
      printf("�J�[�h�������܂���\n");
      drawCard(arrCards, arrHands, pCursor, pCursorHands);
    }
  }
  return 0;
}

/*
    �f�B�[���[���v���C����
    �߂�l�@0:�o�[�X�g���ĂȂ��@1:�o�[�X�g����
*/
int playDealer(S_CARD arrCards[], S_CARD arrHandsDealer[], int *pCursor,
               int *pCursorHandDealer) {
  // �ϐ��錾
  int flgHit; // �J�[�h�������t���O
  int tmpSum; // �f�B�[���[�̎�D�̍��v�l�̒u������
  int i;      // �����p�����[�^

  flgHit = 1;

  while (flgHit == 1) {
    // ��D�̃J�[�h��\������
    printf("�f�B�[���[�̎�D�̃J�[�h:");
    for (i = 0; i < *pCursorHandDealer; i++) {
      displayCard(arrHandsDealer[i]);
    }

    // ��D�̍��v�l���o��
    printf("\n�f�B�[���[�̎�D�̍��v: %d\n",
           calculateHands(arrHandsDealer, pCursorHandDealer));

    // �f�B�[���[�̃o�[�X�g����
    if (judgeBurst(arrHandsDealer, pCursorHandDealer)) {
      printf("�f�B�[���[���o�[�X�g���܂���\n");
      return 1;
    }

    tmpSum = calculateHands(arrHandsDealer, pCursorHandDealer);

    // �l�̃`�F�b�N
    if (tmpSum >= 17) {
      flgHit = 0;
      printf("�J�[�h�������܂���ł���\n");
    } else {
      printf("�J�[�h�������܂���\n");
      drawCard(arrCards, arrHandsDealer, pCursor, pCursorHandDealer);
    }
  }
  return 0;
}

/*
    ��D�̍��v�l���o��
    arrHands[]�@�F��D
    pCursorHands�@�F��D�̃J�[�\��
*/
int calculateHands(S_CARD arrHands[], int *pCursorHands) {
  // �ϐ��錾
  int i;        // �����p�����[�^
  int sum;      // ��D�̍��v�l
  int flgA;     // ��D��A������t���O
  int tmpHands; // �ꎞ�I�ɃJ�[�h�̒l������

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
    �o�[�X�g����
    arrHands[]�@�F��D
    pCursorHands�@�F��D�̃J�[�\��
    �߂�l�@0:�o�[�X�g���ĂȂ��@1:�o�[�X�g����
*/
int judgeBurst(S_CARD arrHands[], int *pCursorHands) {
  // �ϐ��錾
  int flgBurst; // �o�[�X�g���Ă邩�t���O
  int tmpSum;   // ��D�̍��v�l�̓������

  flgBurst = 0;
  tmpSum = calculateHands(arrHands, pCursorHands);

  if (tmpSum > 21) {
    flgBurst = 1;
  }

  return flgBurst;
}

/*
    ���s����
    �߂�l�@0:�v���[���[�̏���
          �@1:�f�B�[���[�̏���
            2:��������
*/
int judgeGame(int sumPlayer, int sumDealer) {
  if (sumPlayer > sumDealer) {
    printf("�v���[���[�̏���");
    return 0;
  } else if (sumPlayer < sumDealer) {
    printf("�f�B�[���[�̏���");
    return 1;
  } else {
    printf("��������");
    return 2;
  }
}