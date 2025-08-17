import java.util.Scanner;

public class Problem1150 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int z;

        do {
            z = sc.nextInt();
        } while (z <= x);

        int count = 0;
        int total = 0;
        while (total < z) {
            total += (x + count);
            count++;
        }
        System.out.println(count);
        
        sc.close();
    }
}