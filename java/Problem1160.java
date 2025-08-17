import java.util.Scanner;

public class Problem1160 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int pa = sc.nextInt();
            int pb = sc.nextInt();

            double g1 = sc.nextDouble() / 100.0;
            double g2 = sc.nextDouble() / 100.0;
            int anos = 0;
            while (pa <= pb) {
                pa += pa * g1;
                pb += pb * g2;
                anos++;
                if (anos > 100) {   
                    break;
                }
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.printf("%d anos.\n", anos);
            }
        }

        sc.close();
    }
}