// import java.util.Scanner;
// 
// public class Problem1435 {
//     public static void main(String[] args) {
//         // Create a Scanner to read input from stdin
//         Scanner sc = new Scanner(System.in);
// 
//         // Read the first integer n; loop continues until n == 0
//         int n = sc.nextInt();
//         while (n > 0) {
// 
//             int control, present, limit;
//             limit = 1;  // 'limit' tracks the maximum value to print on current line
// 
//             // Outer loop: iterate over each of the n rows
//             for (int i = 1; i <= n; i++) {
//                 control = 1;  // 'control' tracks the current value before clamping
// 
//                 // Inner loop: build each of the n columns on row i
//                 for (int j = 1; j <= n; j++) {
//                     if (j > 1) {
//                         // Separate values by a space
//                         System.out.printf(" ");
//                     }
// 
//                     present = control;
//                     // Clamp 'present' between 1 and 'limit'
//                     if (control < 1) {
//                         present = 1;
//                     }
//                     if (control > limit) {
//                         present = limit;
//                     }
// 
//                     // Print the value with two spaces before for alignment
//                     System.out.printf("  %d", present);
// 
//                     // Adjust 'control' to increase then decrease around the center
//                     if ((n % 2) == 0) {
//                         // For even n, increase until j < n/2
//                         if (j < n / 2) {
//                             control++;
//                         }
//                     } else {
//                         // For odd n, increase until j <= n/2
//                         if (j <= n / 2) {
//                             control++;
//                         }
//                     }
//                     if (j > n / 2) {
//                         // After the midpoint, decrease
//                         control--;
//                     }
//                 }
// 
//                 // End of row; move to next line
//                 System.out.println();
// 
//                 // Adjust 'limit' to expand then contract the diamond vertically
//                 if ((n % 2) == 0) {
//                     // For even n, increase until i < n/2
//                     if (i < n / 2) {
//                         limit++;
//                     }
//                 } else {
//                     // For odd n, increase until i <= n/2
//                     if (i <= n / 2) {
//                         limit++;
//                     }
//                 }
//                 if (i > n / 2) {
//                     // After the midpoint, decrease
//                     limit--;
//                 }
//             }
// 
//             // Read next n; stops when 0 is read
//             n = sc.nextInt();
//         }
// 
//         sc.close();  // Close the scanner
//     }
// }

// Versão com StringBuilder:

import java.util.Scanner;

public class Problem1435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n > 0) {

            int control, present, limit;
            limit = 1;  

            for (int i = 1; i <= n; i++) {
                control = 1;
                StringBuilder line = new StringBuilder(n * 4);
                for (int j = 1; j <= n; j++) {
                    if (j > 1) {
                        line.append(" ");
                    }

                    present = control;
                    if (control < 1) {
                        present = 1;
                    }
                    if (control > limit) {
                        present = limit;
                    }

                    line.append(String.format("%3d", present));

                    if ((n % 2) == 0) {
                        if (j < n / 2) {
                            control++;
                        }
                    } else {
                        if (j <= n / 2) {
                            control++;
                        }
                    }
                    if (j > n / 2) {
                        control--;
                    }
                }

                System.out.println(line);

                if ((n % 2) == 0) {
                    if (i < n / 2) {
                        limit++;
                    }
                } else {
                    if (i <= n / 2) {
                        limit++;
                    }
                }
                if (i > n / 2) {
                    limit--;
                }
            }

            System.out.println();
            n = sc.nextInt();
        }

        sc.close();    }
}
