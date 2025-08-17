public class Problem1097 {

    public static void main(String[] args) {
        int J = 7;
        for (int I = 1; I < 10; I+=2) {
            for (int II = 0; II < 3; II++) {
                System.out.printf("I=%d J=%d\n", I, J);
                J--;
            }
            J += 5;
        }
    }
}