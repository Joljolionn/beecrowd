import java.util.Scanner;

public class Problem1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t = sc.nextInt();
        int v = sc.nextInt();
        t = (v * t) / 12;
        System.out.printf("%.3f\n", t);
        sc.close();
    }
}