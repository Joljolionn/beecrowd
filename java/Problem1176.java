import java.util.Scanner;

public class Problem1176 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();

            long anterior = 0;
            long atual = 0;
            for (int j = 0; j < x || j == 1; j++) {
                if (j == 1) {
                    atual = 1;
                }
                long proximo = atual + anterior;
                anterior = atual;
                atual = proximo;
            }
            System.out.printf("Fib(%d) = %d\n", x, atual);

        }

        sc.close();
    }
}