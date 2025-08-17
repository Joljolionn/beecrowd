import java.util.Scanner;

public class Problem1146 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            if (x <= 0) {
                break;
            }
            StringBuilder linha = new StringBuilder(); // NOVA HABILIDADE ADQUIRIDA
            for (int i = 1; i <= x; i++) {
                linha.append(i);
                if (i < x) {
                    linha.append(" ");
                }
            }
            System.out.println(linha);
        }
        sc.close();
    }
}