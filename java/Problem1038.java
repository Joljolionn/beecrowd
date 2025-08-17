import java.util.Scanner;

public class Problem1038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = sc.nextInt();

        double[] codes = {4.0 , 4.5, 5.0, 2.0, 1.5};

        double total = codes[x-1] * y;
        
        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}