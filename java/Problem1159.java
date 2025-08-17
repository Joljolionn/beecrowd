import java.util.Scanner;

public class Problem1159 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();

            if (x == 0) {
                break;
            }

            int i = 0;
            int evens = 0;
            int total = 0;
            while (evens < 5) {
                if (((x + i) % 2) == 0) {
                    total += (x + i);
                    evens++;
                }
                i++;
            }
            System.out.println(total);
        }

        sc.close();
    }
}