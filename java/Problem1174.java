import java.util.Scanner;

public class Problem1174 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, array[i]);
            }
        }

        sc.close();
    }
}