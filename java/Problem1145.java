import java.util.Scanner;

public class Problem1145 { // bom lembrar que muitos printf acabam causando lentidão no código

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int j = 0;

        for (int i = 1; i <= y; i++) {
            j++;
            if (j < x && i != y) {
                System.out.printf("%d ", i);
            } else if (j >= x || i == y) {
                System.out.printf("%d\n", i);
                j = 0;
            }

        }

        sc.close();
    }
}