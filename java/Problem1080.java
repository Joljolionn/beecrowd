import java.util.Scanner;

public class Problem1080 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int position = 0;

        for (int I = 1; I <= 100; I++) {
            int n = sc.nextInt();
            if(n > maior){
                maior = n;
                position = I;
            }
        }
        System.out.println(maior);
        System.out.println(position);

        sc.close();
    }
}