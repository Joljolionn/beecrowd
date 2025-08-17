import java.util.Scanner;

public class Problem1149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = 0;
        int total = 0;
        while (n <= 0) {
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            total += (a + i);
        }
        System.out.println(total);

        sc.close();
    }
}