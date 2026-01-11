// Write a program to calculate and print the Greatest Common Divisor (GCD) of two numbers.
// Note that if any of the number is zero, print the other number.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0) {
            System.out.println(b);
            return;
        }
        if (b == 0) {
            System.out.println(a);
            return;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}
