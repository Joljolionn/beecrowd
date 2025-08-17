import java.util.Scanner;

public class Problem1048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario = sc.nextDouble();
        double percentual;
        double newSal;

        if (salario >= 0 && salario <= 400) {
            percentual = 0.15;
        } else if (salario > 400 && salario <= 800){
            percentual = 0.12;
        } else if (salario > 800 && salario <= 1200){
            percentual = 0.1;
        } else if (salario > 1200 && salario <= 2000){
            percentual = 0.07;
        } else {
            percentual = 0.04;
        }


        newSal = salario + (salario * percentual);

        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %%\n", newSal, (newSal - salario), (percentual * 100));
        
        sc.close();
    }
}