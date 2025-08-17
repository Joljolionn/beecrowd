import java.util.Scanner;

public class Problem1052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int month = sc.nextInt();

        System.out.println(months[month - 1]);

        sc.close();
    }
}