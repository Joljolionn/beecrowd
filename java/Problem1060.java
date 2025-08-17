import java.util.Scanner;

public class Problem1060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;

        for (int I = 0; I < 6; I++) {
            double num = sc.nextDouble();
            if(num > 0){
                positivos++;
            }
        }

        System.out.printf("%d valores positivos\n", positivos);

        sc.close();
    }
}