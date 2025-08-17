import java.util.Scanner;

public class Problem1131 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inter = 0;
        int gremio = 0;
        int empates = 0;
        int grenais = 0;
        int opt = 1;
        while (opt == 1) {
            grenais++;
            int gInter = sc.nextInt();
            int gGremio = sc.nextInt();
            if (gGremio > gInter) {
                gremio++;
            }
            if (gGremio < gInter) {
                inter++;
            }
            if (gGremio == gInter) {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            opt = sc.nextInt();
        }

        System.out.printf("%d grenais\n", grenais);
        System.out.printf("Inter:%d\n", inter);
        System.out.printf("Gremio:%d\n", gremio);
        System.out.printf("Empates:%d\n", empates);

        if (gremio > inter) {
            System.out.println("Gremio venceu mais");
        } 
        if (gremio < inter) {
            System.out.println("Inter venceu mais");
        }
        if (gremio == inter) {
            System.out.println("Não houve vencedor");
        }

        sc.close();
    }
}