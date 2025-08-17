import java.util.Scanner;

public class Problem1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int j = 0;
            int impar = 0;
            int total = 0;
            while (impar < y) {
                if (((x + j) % 2) != 0) {
                    total += (x + j);
                    impar++;
                }
                j++;
            }
            System.out.println(total);
        }

        sc.close();
    }
}