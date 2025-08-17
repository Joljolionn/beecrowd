import java.util.Scanner;

public class Problem1072 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;
        int n = sc.nextInt();
        int tmp;
        for (int I = 0; I < n; I++) {
            tmp = sc.nextInt();
            if(tmp >= 10 && tmp <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n%d out\n", in, out);

        sc.close();
    }
}