import java.util.Scanner;

public class Problem1036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double t = (b * b) - (4 * a * c);
        if (t < 0 || a == 0 ) {
            System.out.println("Impossivel calcular");
            sc.close();
            return;
        }
        double r1 = ((b * -1) + Math.sqrt(t))/(2 * a);
        double r2 = ((b * -1) - Math.sqrt(t))/(2 * a);
        
        System.out.printf("R1 = %.5f\n", r1);
        System.out.printf("R2 = %.5f\n", r2);

        sc.close();
    }
}