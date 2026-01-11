// Write a program to calculate and print the Least Common Multiple (LCM) of two numbers.
// Note that if any of the two numbers is zero, then the LCM of the two numbers is also zero.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println(0);
            return;
        }

        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = Math.abs(a * b) / gcd;

        System.out.println(lcm);
    }
}
