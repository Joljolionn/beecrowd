import java.util.ArrayList;
import java.util.Scanner;

public class Problem1179 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int tmp = sc.nextInt();

            if ((tmp % 2) == 0) {
                pares.add(tmp);
            } else {
                impares.add(tmp);
            }

            if (pares.size() == 5) {
                esvaziarArray(pares, "par");
            }
            if (impares.size() == 5) {
                esvaziarArray(impares, "impar");
            }
            
        }
        esvaziarArray(impares, "impar");
        esvaziarArray(pares, "par");


        sc.close();
    }

    public static void esvaziarArray(ArrayList<Integer> array, String nome){
        for (int index = 0; array.size() > 0; index++) {
            System.out.printf("%s[%d] = %d\n", nome, index, array.remove(0));
        }
    }
}