import java.util.Scanner;

public class Problem1007 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		a *= b;
		c *= d;
		a -= c;
		System.out.printf("DIFERENCA = %d\n", a);
		sc.close();
	}
}
