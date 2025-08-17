import java.util.Scanner;

public class Problem1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, tmp;

        for (int I = 0; I < 5; I++) {
            tmp = sc.nextInt();
            if((tmp % 2) == 0){
                pares++;
            }
        }

        System.out.printf("%d valores pares\n", pares);

        sc.close();
    }
}