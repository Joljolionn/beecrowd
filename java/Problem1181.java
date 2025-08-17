import java.util.Scanner;

public class Problem1181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();

        char opt = sc.next().charAt(0);

        double total = 0.0;

        for(int I = 0; I < 12; I++){
            for(int II = 0; II < 12; II++){
                if(I == line){
                    total += sc.nextDouble();
                } else {
                    sc.nextDouble();
                }   
            }
        }

        if (opt == 'M') {
            total /= 12;
        }

        System.out.printf("%.1f\n", total);

        sc.close();
    }
}