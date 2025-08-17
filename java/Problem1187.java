import java.util.Scanner;

public class Problem1187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int upperLimit = 11;
        int lowerLimit = 0;
        double resultado = 0;
        int qtd = 0;
        char opt = sc.next().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j > lowerLimit && j < upperLimit) {
                    resultado += sc.nextDouble();
                    qtd++;
                } else {
                    sc.nextDouble();
                }
            }
            upperLimit--;
            lowerLimit++;
        }

        if (opt == 'M') {
            resultado /= qtd;
        }

        System.out.printf("%.1f\n", resultado);

        sc.close();
    }
}
