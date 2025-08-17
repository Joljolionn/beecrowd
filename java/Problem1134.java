import java.util.Scanner;

public class Problem1134 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            int item = sc.nextInt();
            if (item > 0 && item < 5) {
                if (item == 1) {
                    alcool++;
                }
                if (item == 2) {
                    gasolina++;
                }
                if (item == 3) {
                    diesel++;
                }
                if (item == 4) {
                    break;
                }
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);

        sc.close();
    }
}