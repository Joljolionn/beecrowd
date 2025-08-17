import java.util.Scanner;

public class Problem1118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 1;
        do {
            double total = 0;
            int I = 0;
            while (I < 2) {
                double nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("nota invalida");
                } else {
                    total += nota;
                    I++;
                }
            }

            System.out.printf("media = %.2f\n", total / 2.0);
            while (true) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opt = sc.nextInt();
                if (opt == 1 || opt == 2) {
                    break;
                }
                
            }
        } while (opt == 1);
        sc.close();
    }
}