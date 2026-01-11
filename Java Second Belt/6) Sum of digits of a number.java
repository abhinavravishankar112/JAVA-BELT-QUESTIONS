// Write a program to calculate and print the sum of the digits of a given number.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        n = Math.abs(n); // in case the number is negative

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
