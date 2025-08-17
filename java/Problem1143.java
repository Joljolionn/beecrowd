import java.util.Scanner;

public class Problem1143 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] nums = new double[3];

        for (int line = 1; line <= n; line++) {
            for (int col = 0; col < 3; col++) {
                nums[col] = Math.pow(line, (col + 1));
            }
            System.out.printf("%.0f %.0f %.0f\n", nums[0], nums[1], nums[2]);
        }

        sc.close();
    }
}