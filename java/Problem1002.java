import java.util.Scanner;

public class Problem1002 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		x = 3.14159 * (x * x);
		System.out.printf("A=%.4f\n", x);
		sc.close();
	}
}
