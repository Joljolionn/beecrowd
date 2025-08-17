public class Problem1156 {

    public static void main(String[] args) {
        
        double total = 1;
        double par = 2;

        for (int impar = 3; impar <= 39; impar += 2) {
            total += (impar / (double) par);
            par *= 2;
        }

        System.out.printf("%.2f\n", total);
    }
}