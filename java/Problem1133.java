import java.util.Scanner;

public class Problem1133 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            int tmp = y;
            y = x;
            x = tmp;
        }

        for (int i = x + 1; i < y; i++) {
            int rest = i % 5; 
            if ( rest == 2 || rest == 3) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}