import java.util.Scanner;

public class Problem1015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        x1 = Math.pow((x2 - x1), 2);
        y1 = Math.pow((y2 - y1), 2);
        x1 = Math.sqrt(x1 + y1);

        System.out.printf("%.4f\n", x1);
        sc.close();
    }
}