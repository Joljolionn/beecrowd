import java.util.Scanner;

public class Problem1014{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double l = sc.nextDouble();
        l = d/l;
        System.out.printf("%.3f km/l\n", l);
        sc.close();
    }
}