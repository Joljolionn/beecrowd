import java.util.Scanner;

public class Problem1047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt() * 60;
        inicio += sc.nextInt();

        int fim = sc.nextInt() * 60;
        fim += sc.nextInt();

        int total;

        if(inicio < fim){
            total = fim - inicio;
        } else if(inicio > fim){
            total = fim + (24 * 60) - inicio;
        } else {
            total = (24 * 60);
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", total / 60, total % 60 );

        sc.close();
    }
}