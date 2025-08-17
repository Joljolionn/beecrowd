import java.util.Scanner;

public class Problem1004 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x *= sc.nextInt();
		System.out.printf("PROD = %d\n", x);
		sc.close();
	}
}
