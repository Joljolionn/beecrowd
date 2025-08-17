import java.util.Scanner;

public class Problem1049 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grupo = sc.nextLine();
        String familia = sc.nextLine();
        String dieta = sc.nextLine();
        if ((grupo).equals("vertebrado")) {
            if ((familia).equals("ave")) {
                if ((dieta).equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if ((dieta).equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if ((familia).equals("inseto")) {
                if ((dieta).equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if ((dieta).equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}