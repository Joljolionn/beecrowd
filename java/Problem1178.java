import java.util.Scanner;

public class Problem1178 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] n = new double[100];

        n[0] = sc.nextDouble();

        for (int i = 1; i < n.length; i++) {
            n[i] = (n[i - 1] /2);
        }


        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }

        sc.close();
    }
}