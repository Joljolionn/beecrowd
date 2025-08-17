import java.util.Scanner;

public class Problem1142 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int contador = 1;

        for (int line = 0; line < n; line++) {
            for (int col = 0; col < 4; col++) {
                if (col != 3) {
                    System.out.printf("%d ", contador);
                }
                contador++;
            }
            System.out.printf("PUM\n");
        }

        sc.close();
    }
}