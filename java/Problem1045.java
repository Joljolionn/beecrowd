import java.util.Scanner;
import java.util.Arrays;

public class Problem1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nums = new double[3];

        for (int I = 0; I < nums.length; I++) {
            nums[I] =  sc.nextDouble();
        }
        Arrays.sort(nums);
        double a = nums[2];
        double b = nums[1];
        double c = nums[0];



        if (a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
            sc.close();
            return;
        }
        if ((a * a) == ((b * b) + (c * c))) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if ((a * a) > ((b * b) + (c * c))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if ((a * a) < ((b * b) + (c * c))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();
    }
}