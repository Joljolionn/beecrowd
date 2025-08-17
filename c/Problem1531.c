#include <stdlib.h>
#include <stdio.h>

typedef struct memo{
    unsigned long tamanho;
    unsigned long fim;
    unsigned long *fib_nums;
} memo;

unsigned long fibonacci(unsigned long n, memo *memo){
    if (n < memo->fim) {
        return memo->fib_nums[n];
    } else {
        while (memo->fim <= n) {
            if (memo->fim >= memo->tamanho) {
                memo->tamanho += 100;
                memo->fib_nums = realloc(memo->fib_nums, sizeof(unsigned long) * memo->tamanho);
                if (memo->fib_nums == NULL) {
                    return 0;
                }
            }
            memo->fib_nums[memo->fim] = memo->fib_nums[memo->fim - 1] + memo->fib_nums[memo->fim - 2];
            memo->fim++;
        }
    }
    return memo->fib_nums[n];
}

unsigned long pisano_period(unsigned long m) {
    if (m == 1) return 1; 
    unsigned long a = 0, b = 1, temp;
    unsigned long period = 0;
    do {
        temp = (a + b) % m;  
        a = b;              
        b = temp;
        period++;           
    } while (!(a == 0 && b == 1)); 
    return period;
}

unsigned long fibonacci_mod(unsigned long n, unsigned long m) {
    if (m == 0) return 0; 
    if (n == 0) return 0; 

    unsigned long p = pisano_period(m);
    unsigned long k = n % p;

    unsigned long a = 0, b = 1, temp;
    for (unsigned long i = 1; i < k; i++) {
        temp = (a + b) % m;
        a = b;
        b = temp;
    }
    return b % m;
}

int main(int argc, char *argv[]){

    memo fib_memo;
    fib_memo.tamanho = 100;
    fib_memo.fib_nums = (unsigned long*) malloc(sizeof(unsigned long) * fib_memo.tamanho);
    if (fib_memo.fib_nums == NULL) {
        return 1;
    }
    fib_memo.fib_nums[0] = 0;
    fib_memo.fib_nums[1] = 1;
    fib_memo.fib_nums[2] = 1;
    fib_memo.fim = 2;

    unsigned long n, m;
    while (1) {
        int works = scanf("%lu %lu", &n, &m);
        if (works == EOF || works != 2) {
            break;
        }

        unsigned long fib_one = fibonacci(n, &fib_memo);
        unsigned long result = fibonacci_mod(fib_one, m);

        printf("%lu\n", result);
    }
    free(fib_memo.fib_nums);
    return 0;
}
