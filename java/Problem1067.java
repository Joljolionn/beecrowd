import java.util.Scanner;

public class Problem1067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int I = 1; I <= n; I++) {
            if((I % 2) != 0){
                System.out.println(I);
            }
        }

        sc.close();
    }
}