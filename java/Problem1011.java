import java.util.Scanner;

public class Problem1011 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		x = (4.0/3) * 3.14159 * (x * x * x);
		System.out.printf("VOLUME = %.3f\n", x);
		sc.close();
	}
}
