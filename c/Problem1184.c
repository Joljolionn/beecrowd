#include <stdio.h>

int main(int argc, char *argv[]) {

  char opt;
  int diagonal = 0, quantidade = 0;
  double total = 0, tmp;

  scanf("%c\n", &opt);

  for (int i = 0; i <= 11; i++) {
    for (int j = 0; j <= 11; j++) {
      if (j < diagonal) {
        scanf("%lf\n", &tmp);
        total += tmp;
        quantidade++;
      } else {
        scanf("%*lf");
      }
    }
    diagonal++;
  }

  if (opt == "M") {
    total /= quantidade;
  }

  printf("%.1lf", total);

  return 0;
}
