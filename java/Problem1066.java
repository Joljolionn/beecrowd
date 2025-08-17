import java.util.Scanner;

public class Problem1066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0, positivos = 0, negativos = 0, tmp;

        for (int I = 0; I < 5; I++) {
            tmp = sc.nextInt();
            if ((tmp % 2) == 0){
                pares++;
            } else {
                impares++;
            }
            if(tmp > 0){
                positivos++;
            } else if (tmp < 0){
                negativos++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", impares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", negativos);

        sc.close();
    }
}