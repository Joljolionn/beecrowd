import java.util.Scanner;

public class Problem1078 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int I = 1; I <= 10; I++) {
            System.out.printf("%d x %d = %d\n", I, n, (n * I));
        }

        sc.close();
    }
}