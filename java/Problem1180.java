import java.util.Scanner;

public class Problem1180 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        int menor = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < x[menor]){
                menor = i;
            }
        }
        
        System.out.printf("Menor valor: %d\n", x[menor]);
        System.out.printf("Posicao: %d\n", menor);

        sc.close();
    }
}