import java.util.Scanner;

public class Problem1165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            boolean primo = true;

            for (int j = 2; j <= (x/2); j++) {
                if ((x % j) == 0) {
                    primo = false;
                    break;        
                }
            }

            if (primo) {
                System.out.printf("%d eh primo\n", x);
            } else {
                System.out.printf("%d nao eh primo\n", x);
            }
        }

        sc.close();
    }
}