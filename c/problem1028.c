#include <stdio.h>
int mmc(int f1, int f2){

    if(f1 == f2){
        return f1;
    }
    int menor;
    int maior;
    if (f1 > f2) {
        menor = f2;
        maior = f1;
    } else {
        menor = f1;
        maior = f2;
    }
    if (menor == 1) {
        return 1;
    }
    if ((maior % menor) == 0){
        return menor;
    } 

    int mmc = menor / 2;

    while (mmc > 1) {
        if(((f1 % mmc) == 0) && ((f2 % mmc) == 0)){
            break;
        }

        mmc--;
    }
    return mmc;
}

int main(int argc, char *argv[])
{
    int n;
    scanf("%d\n", &n);
    for (int i = 0; i < n; i++) {
        int f1, f2;
        scanf("%d %d", &f1, &f2);
        printf("%d\n", mmc(f1, f2));
    }

    return 0;
}
