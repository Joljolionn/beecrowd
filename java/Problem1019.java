import java.util.Scanner;

public class Problem1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();

        int min = sec / 60;
        sec %= 60;

        int h = min / 60;
        min %= 60;

        System.out.printf("%d:%d:%d\n", h, min, sec);
        sc.close();
    }
}