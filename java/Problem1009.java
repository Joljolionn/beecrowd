import java.util.Scanner;

public class Problem1009 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		double fs = sc.nextDouble();
		double st = sc.nextDouble();
		System.out.printf("TOTAL = R$ %.2f\n", (fs + (st * 0.15)));
		sc.close();
	}
}
