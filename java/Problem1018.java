import java.util.Scanner;

public class Problem1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        System.out.println(value);

        System.out.printf("%d nota(s) de R$ 100,00\n", (value / 100));

        value %= 100;

        System.out.printf("%d nota(s) de R$ 50,00\n", (value / 50));

        value %= 50;

        System.out.printf("%d nota(s) de R$ 20,00\n", (value / 20));

        value %= 20;

        System.out.printf("%d nota(s) de R$ 10,00\n", (value / 10));

        value %= 10;

        System.out.printf("%d nota(s) de R$ 5,00\n", (value / 5));

        value %= 5;

        System.out.printf("%d nota(s) de R$ 2,00\n", (value / 2));

        value %= 2;

        System.out.printf("%d nota(s) de R$ 1,00\n", value);

        sc.close();

    }
}