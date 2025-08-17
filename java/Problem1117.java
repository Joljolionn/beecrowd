import java.util.Scanner;

public class Problem1117 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int I = 0;
        double total = 0;
        while (I < 2) {
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                total += nota;
                I++;
            }
        }

        System.out.printf("media = %.2f\n", total/2.0);

        sc.close();
    }
}