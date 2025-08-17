import java.util.Scanner;

public class Problem1006 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		x *= 2;
		y *= 3;
		z *= 5;
		x = (x + y + z)/10;
		System.out.printf("MEDIA = %.1f\n", x);
		sc.close();
	}
}
