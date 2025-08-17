import java.util.Scanner;

public class Problem1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int total;
        if(inicio < fim){
            total = fim - inicio;
            
        } else if (inicio > fim) {
            total = fim + 24 - inicio;

        } else {
            total = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", total);

        sc.close();
    }
}