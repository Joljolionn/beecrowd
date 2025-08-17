import java.util.Scanner;

public class Problem1177 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] n = new int[1000];
        int contador = 0;
        for (int i = 0; i < n.length; i++) {
            if (contador == t) {
                contador = 0;
            }

            n[i] = contador;
            
            contador++;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }

        sc.close();
    }
}