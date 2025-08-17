import java.util.Scanner;

public class Problem1012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] x = sc.nextLine().split(" ");
		double a = Double.parseDouble(x[0]);
		double b = Double.parseDouble(x[1]);
		double c = Double.parseDouble(x[2]);
		System.out.printf("TRIANGULO: %.3f\n", (a * c)/2);
		System.out.printf("CIRCULO: %.3f\n", 3.14159 * (c * c));
		System.out.printf("TRAPEZIO: %.3f\n", ((a + b) * c)/2);
		System.out.printf("QUADRADO: %.3f\n", b * b);
		System.out.printf("RETANGULO: %.3f\n", a * b);
		sc.close();
	}
}
