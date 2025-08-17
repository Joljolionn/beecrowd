import java.util.Scanner;

public class Problem1099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int I = n; I > 0; I--) {
            int bottom = sc.nextInt();
            int top = sc.nextInt();
            int qtd = 0;
            if (bottom < top) {
             bottom++;
             while (bottom < top) {
                if ((bottom % 2) != 0) {
                    qtd += bottom;
                }
                bottom++;
             }   
            } else if (top < bottom) {
                top++;
                while (top < bottom) {
                    if ((top % 2) != 0) {
                        qtd += top;
                    }
                    top++;
                }
            }
            System.out.println(qtd);
        }

        sc.close();
    }
}