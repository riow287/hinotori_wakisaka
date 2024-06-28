extern int n[4];

void swap(int *a, int *b);
void reverse(void) {
  swap(&n[0], &n[3]);
  swap(&n[1], &n[2]);
}
void swap(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}