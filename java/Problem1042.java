import java.util.Arrays;
import java.util.Scanner;

public class Problem1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        
        int[] numsSorted = nums.clone();
        
        
        Arrays.sort(numsSorted);
        
        for(int num: numsSorted){
            System.out.println(num);
        }
        
        System.out.println();
        
        for(int num: nums){
            System.out.println(num);
        }
        
        sc.close();
    }
}