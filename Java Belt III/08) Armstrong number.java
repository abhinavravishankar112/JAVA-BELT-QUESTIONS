// An Armstrong number is a number that is equal to the sum of its own digits
// raised to the power of the number of digits in that number.
// Write a program to determine whether a given number is an Armstrong number or not.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
