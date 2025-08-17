import java.util.Scanner;

public class Problem1151 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int anterior = 0;
        int atual = 1;
        StringBuilder linha = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                linha.append(anterior);
            } else if (i == 1) {
                linha.append(" ").append(atual);
            } else {

                int proximo = atual + anterior;
                anterior = atual;
                atual = proximo;
                linha.append(" ").append(proximo);
            }
        }

        System.out.println(linha);

        sc.close();
    }
}