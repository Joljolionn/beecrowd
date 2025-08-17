public class Problem1095 {

    public static void main(String[] args) {
        int I = 1;
        for (int J = 60; J >= 0; J-=5) {
            System.out.printf("I=%d J=%d\n", I, J);
            I += 3;
        }
    }
}