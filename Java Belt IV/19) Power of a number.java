//Input Format The first line contains a floating-point number x (the base) The second

import java.util.*;

public class Solution {   // rename to Main if needed
    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;   // base case
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();  // base
        int n = sc.nextInt();        // exponent

        double result = power(x, n);

        System.out.printf("%.2f", result);
    }
}
