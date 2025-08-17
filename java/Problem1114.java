import java.util.Scanner;

public class Problem1114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int attempt = sc.nextInt();
            if (attempt == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        sc.close();
    }
}