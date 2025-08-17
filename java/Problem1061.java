import java.util.Scanner;

public class Problem1061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] line1 = sc.nextLine().split(" ");
        int startS = Integer.parseInt(line1[1]) * 24 * 60 * 60;
        String[] line2 = sc.nextLine().split(" : ");
        startS += Integer.parseInt(line2[0]) * 60 * 60;
        startS += Integer.parseInt(line2[1]) * 60;
        startS += Integer.parseInt(line2[2]);

        String[] line3 = sc.nextLine().split(" ");
        int endS = Integer.parseInt(line3[1]) * 24 * 60 * 60;
        String[] line4 = sc.nextLine().split(" : ");
        endS += Integer.parseInt(line4[0]) * 60 * 60;
        endS += Integer.parseInt(line4[1]) * 60;
        endS += Integer.parseInt(line4[2]);

        int diffS = endS - startS;

        System.out.printf("%d dia(s)\n", diffS/(60*60*24));
        diffS %= (60*60*24);

        System.out.printf("%d hora(s)\n", diffS/(60*60));
        diffS %= (60*60);

        System.out.printf("%d minuto(s)\n", diffS/60);
        diffS %= 60;

        System.out.printf("%d segundo(s)\n", diffS);

        sc.close();
    }
}