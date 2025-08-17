import java.util.Scanner;

public class Problem1008 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int wh = sc.nextInt();
		double sph = sc.nextDouble();
		System.out.printf("NUMBER = %d\n", num);
		System.out.printf("SALARY = U$ %.2f\n", (wh * sph));
		sc.close();
	}
}
