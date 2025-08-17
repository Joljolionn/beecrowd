import java.util.Scanner;

public class Problem1010 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] p1 = sc.nextLine().split(" ");
		String[] p2 = sc.nextLine().split(" ");
		double t1 = Integer.parseInt(p1[1]) * Double.parseDouble(p1[2]);
		double t2 = Integer.parseInt(p2[1]) * Double.parseDouble(p2[2]);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", t1 + t2);
		sc.close();
	}
}
