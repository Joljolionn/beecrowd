import java.util.Scanner;

public class Problem1005 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		x *= 3.5;
		y *= 7.5;
		x = (x + y)/11;
		System.out.printf("MEDIA = %.5f\n", x);
		sc.close();
	}
}
