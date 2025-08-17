import java.util.HashMap;
import java.util.Scanner;

public class Problem1050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> ddd = new HashMap<>();

        ddd.put(61, "Brasilia");
        ddd.put(71, "Salvador");
        ddd.put(11, "Sao Paulo");
        ddd.put(21, "Rio de Janeiro");
        ddd.put(32, "Juiz de Fora");
        ddd.put(19, "Campinas");
        ddd.put(27, "Vitoria");
        ddd.put(31, "Belo Horizonte");
        
        int phone = sc.nextInt();
        if(ddd.containsKey(phone)){
            System.out.println(ddd.get(phone));
        } else {
            System.out.println("DDD nao cadastrado");
        }

        sc.close();
    }
}