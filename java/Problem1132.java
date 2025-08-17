import java.util.Scanner;

public class Problem1132 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int total = 0;

        if (x > y) {
            int tmp = y;
            y = x;
            x = tmp;
        }
        for (int i = x; i <= y; i++) {
            if ((i % 13) != 0) {
                total += i;
            }
        }

        System.out.println(total);

        sc.close();
    }
}