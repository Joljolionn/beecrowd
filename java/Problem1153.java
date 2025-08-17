import java.util.Scanner;

public class Problem1153 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = n;
        for (int i = (n - 1); i > 1; i--) {
            total *= i;
        }

        System.out.println(total);

        sc.close();
    }
}