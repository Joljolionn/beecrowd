import java.util.Scanner;

public class Problem1190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int right = 11;
        int left = 0;
        int qtd = 0;
        double resultado = 0;
        char opt = sc.nextLine().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (j > right && j > left) {
                    resultado += sc.nextDouble();
                    qtd++;
                } else {
                    sc.next();
                }
            }
            right--;
            left++;
        }

        if (opt == 'M') {
            resultado /= qtd;
        }

        System.out.printf("%.1f\n", resultado);

        sc.close();
    }
}
