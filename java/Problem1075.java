import java.util.Scanner;

public class Problem1075 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int I = 1; I <= 10000; I++){
            if ((I % n) == 2) {
                System.out.println(I);
            }
        }

        sc.close();
    }
}