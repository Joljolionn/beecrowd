import java.util.Scanner;

public class Problem1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        if((x + y) <= z || (x + z) <= y || (y + z) <= x){
            double area = ((x + y)*z)/2;
            System.out.printf("Area = %.1f\n", area);
        } else {
            System.out.printf("Perimetro = %.1f\n", (x + y + z));
        }

        sc.close();
    }
}