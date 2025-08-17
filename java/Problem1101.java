import java.util.Scanner;

public class Problem1101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            int x = sc.nextInt();

            int y = sc.nextInt();
            int total = 0;

            if (x <= 0 || y <= 0) {
                break;
            }

            if (x >= y) {
                while (y <= x) {
                    total += y;
                    System.out.printf("%d ", y);
                    y++;
                }
            } else {
                while (x <= y) {
                    total += x;

                    System.out.printf("%d ", x);
                    x++;
                }
            }

            System.out.printf("Sum=%d\n", total);

        }
        sc.close();
    }
}