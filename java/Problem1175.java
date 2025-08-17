import java.util.Scanner;

public class Problem1175 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[20];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < (n.length/2); i++) {
            int tmp = n[n.length - 1 - i];
            n[n.length - 1 - i] = n[i];
            n[i] = tmp;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
        
        sc.close();
    }
}