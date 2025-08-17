import java.util.Scanner;

public class Problem1154 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int i = 0;

        while (true) {
            int x = sc.nextInt();
            if (x < 0) {
                break;
            }
            total += x;
            i++;
        }

        System.out.printf("%.2f\n", total/ (double) i);

        sc.close();
    }
}