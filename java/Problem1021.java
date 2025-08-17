import java.util.Scanner;

public class Problem1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        int cents = (int) (value * 100);

        System.out.println("NOTAS:");

        System.out.printf("%d nota(s) de R$ 100.00\n", (cents / 10000));

        cents %= 10000;

        System.out.printf("%d nota(s) de R$ 50.00\n", (cents / 5000));

        cents %= 5000;

        System.out.printf("%d nota(s) de R$ 20.00\n", (cents / 2000));

        cents %= 2000;

        System.out.printf("%d nota(s) de R$ 10.00\n", (cents / 1000));

        cents %= 1000;

        System.out.printf("%d nota(s) de R$ 5.00\n", (cents / 500));

        cents %= 500;

        System.out.printf("%d nota(s) de R$ 2.00\n", (cents / 200));

        cents %= 200;

        System.out.println("MOEDAS:");


        System.out.printf("%d moeda(s) de R$ 1.00\n", (cents / 100));

        cents %= 100;

        System.out.printf("%d moeda(s) de R$ 0.50\n", (cents / 50));

        cents %= 50;

        System.out.printf("%d moeda(s) de R$ 0.25\n", (cents / 25));

        cents %= 25;

        System.out.printf("%d moeda(s) de R$ 0.10\n", (cents / 10));

        cents %= 10;

        System.out.printf("%d moeda(s) de R$ 0.05\n", (cents / 5));

        cents %= 5;

        System.out.printf("%d moeda(s) de R$ 0.01\n", cents );

        sc.close();
    }
}