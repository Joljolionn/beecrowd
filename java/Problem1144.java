import java.util.Scanner;

public class Problem1144 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double primeiro, segundo, terceiro;
            primeiro = Math.pow(i, 1);
            segundo = Math.pow(i, 2);
            terceiro = Math.pow(i, 3);
            System.out.printf("%.0f %.0f %.0f\n", primeiro, segundo, terceiro);
            System.out.printf("%.0f %.0f %.0f\n", primeiro, segundo + 1, terceiro + 1);
        }

        sc.close();
    }
}