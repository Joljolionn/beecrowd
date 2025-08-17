import java.util.Scanner;

public class Problem1071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;

        if(start > end){
            int tmp = end;
            end = start;
            start = tmp;
        }

        for(int I = (start + 1); I < end; I++){
            if ((I % 2) != 0) {
                sum += I;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}