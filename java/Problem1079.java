import java.util.Scanner;

public class Problem1079 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int I = 0; I < n; I++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double total = ((n1 * 2) + (n2 * 3) + (n3 * 5))/10;
            System.out.printf("%.1f\n", total);
        }

        sc.close();
    }
}