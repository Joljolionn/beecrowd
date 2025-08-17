import java.util.Scanner;

public class Problem1070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int I = 0;
        while (I < 6) {
            if ((x % 2) != 0){
                System.out.println(x);
                I++;
            }
            x++;
        }

        sc.close();
    }
}