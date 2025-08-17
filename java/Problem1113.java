import java.util.Scanner;

public class Problem1113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > y) {
                System.out.println("Decrescente");
            }
            if (y > x) {
                System.out.println("Crescente");
            }
            if (x == y) {
                break;
            }
        }

        sc.close();
    }
}