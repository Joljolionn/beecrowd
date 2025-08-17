import java.util.Scanner;

public class Problem1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        // Cálculo da média com truncamento manual
        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10.0;
        media = (int)(media * 10.0) / 10.0; // Trunca para 1 casa decimal

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);

            // Cálculo da média final com truncamento
            double mediaFinal = (media + exame) / 2.0;
            mediaFinal = (int)(mediaFinal * 10.0) / 10.0;

            System.out.println(mediaFinal >= 5.0 ? "Aluno aprovado." : "Aluno reprovado.");
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }

        sc.close();
    }
}
