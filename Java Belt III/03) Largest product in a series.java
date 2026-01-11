// Write a program to find the largest product in a series of N digit number.
// Input format: N is the given series and K is size of consecutive numbers
// chosen from the series.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int k = sc.nextInt();

        long maxProduct = 0;

        for (int i = 0; i <= n.length() - k; i++) {
            long product = 1;

            for (int j = i; j < i + k; j++) {
                product *= (n.charAt(j) - '0');
            }

            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println(maxProduct);
    }
}
