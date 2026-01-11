// Given a number n, write a program that prints the numbers from 1 to n.
// But for multiples of three, print Fizz instead of the number
// and for the multiples of five, print Buzz.
// For numbers that are multiples of both three and five, print FizzBuzz.
// Print -1 if n does not follow the constraints.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
