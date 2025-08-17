import java.util.Scanner;

public class Problem1094 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int coelhos = 0;
        int sapos = 0;
        int ratos = 0;

        for (int I = 0; I < n; I++) {
            String[] linha = sc.nextLine().split(" ");
            int qtd = Integer.parseInt(linha[0]);
            switch (linha[1]) {
                case "C":
                    coelhos += qtd;
                    break;
            
                case "R":

                    ratos += qtd;
                    break;

                case "S":

                    sapos += qtd;
                    break;

                default:
                    break;
            }
        }

        System.out.printf("Total: %d cobaias\n", (coelhos + sapos + ratos));

        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", (coelhos/ (double) (coelhos + sapos + ratos))*100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (ratos/ (double) (coelhos + sapos + ratos))*100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (sapos/ (double) (coelhos + sapos + ratos))*100);

        sc.close();
    }
}