public class Problem1155 {

    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            total += (1/ (double) i);
        }
        System.out.printf("%.2f\n", total);
    }
}