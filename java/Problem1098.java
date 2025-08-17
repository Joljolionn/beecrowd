public class Problem1098 {

    public static void main(String[] args) {
        for (double I = 0; I <= 2; I += 0.2) {
            for (int II = 1; II < 4; II++) {
                double rounded = Math.round(I * 10) / 10.0; // Arredondando pq o ponto flutuante do java não ajuda nem um pouco
                if (rounded == 0 || rounded == 1 || rounded == 2) {
                    System.out.printf("I=%.0f J=%.0f\n", I, (II + I));
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", I,  (II + I));
                }
            }
        }
    }
}