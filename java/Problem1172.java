import java.util.Scanner;

public class Problem1172 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            int num = sc.nextInt();

            if (num <= 0) {
                x[i] = 1;
            } else{
                x[i] = num;
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.printf("X[%d] = %d\n", i, x[i]);
        }
        
        sc.close();
    }
}