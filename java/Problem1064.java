import java.util.Scanner;

public class Problem1064 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        double media = 0;
        double tmp;

        for (int I = 0; I < 6; I++) {
            tmp = sc.nextDouble();
            if (tmp > 0) {
                positivos++;
                media += tmp;
            }
        }

        media /= positivos;

        System.out.printf("%d valores positivos\n", positivos);
        System.out.printf("%.1f\n", media);

        sc.close();
    }
}