import java.util.Scanner;

public class Problem1183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char operation = sc.nextLine().charAt(0);
        int qtd = 0;
        double total = 0;
        int diagonal;
        for(int X = 0; X < 12; X++){
            diagonal = X;
            for(int Y = 0; Y < 12; Y++){
                if (Y > diagonal){
                    total += sc.nextDouble();
                    qtd++;
                } else{
                    sc.next();
                }
            }
        }
        if (operation == 'M'){
            total /= qtd;
        }
        System.out.printf("%.1f\n", total);
        sc.close();
    }
}