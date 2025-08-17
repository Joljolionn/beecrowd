import java.util.Scanner;

public class Problem1013 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] x = sc.nextLine().split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = Integer.parseInt(x[2]);
		int maior;
		if (a > b) {
			if (a > c) {
				maior = a;	
			} else {
				maior = c;
			}
		} else {
			if (b > c) {
				maior = b;
			} else {
				maior = c;
			}
		}
		System.out.printf("%d eh o maior\n", maior);
		sc.close();
	}
}
