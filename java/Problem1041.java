import java.util.Scanner;

public class Problem1041 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double y = sc.nextDouble();
        sc.close();

        if (x > 0){
            if (y > 0){
                System.out.println("Q1");
            } else if (y < 0) {
                System.out.println("Q4");
            } else{
                System.out.println("Eixo X");
            }
        }

        if (x < 0){
            if (y > 0) {
                System.out.println("Q2");
            } else if (y < 0) {
                System.out.println("Q3");
                
            } else {
                System.out.println("Eixo X");
            }
        }
    
        if (x == 0){
            if (y == 0) {
                System.out.println("Origem");
            } else {
                System.out.println("Eixo Y");
            }
        }

    }
}