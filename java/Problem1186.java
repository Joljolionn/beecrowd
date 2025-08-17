import java.util.Scanner;

public class Problem1186 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opt = sc.next().charAt(0);
        int diagonal = 11;
        int qtd = 0;
        double resultado = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j > diagonal) {
                    resultado += sc.nextDouble();
                    qtd++;
                } else {
                    sc.nextDouble();
                }
            }
            diagonal--;
        }

        if (opt == 'M') {
            resultado /= qtd;
        }
        System.out.printf("%.1f\n", resultado);
        sc.close();
    }
    
}