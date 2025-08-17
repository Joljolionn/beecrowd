import java.util.Scanner;

public class Problem1073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int I = 1; I <= n; I++) {
            if ((I % 2) == 0) {
                System.out.printf("%d^2 = %d\n", I,  (I * I));
            }
        }

        sc.close();
    }
}