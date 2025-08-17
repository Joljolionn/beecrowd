import java.util.Scanner;

public class Problem1074 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int I = 0; I < n; I++){
            int x = sc.nextInt();
            if(x == 0){
                System.out.println("NULL");
                continue;
            }
            if((x % 2) == 0) {
                System.out.print("EVEN ");
            } else {
                System.out.print("ODD ");
            }
            if (x > 0) {
                System.out.print("POSITIVE\n");
            } else {
                System.out.print("NEGATIVE\n");
            }
        }

        sc.close();
    }
}