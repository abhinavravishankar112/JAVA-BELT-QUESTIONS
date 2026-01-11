// Write a program to Initialize an array of size 6 and print the count of only prime elements in an array.
// Note:- '0' and '1' are not prime.
// Input format:
// The first line will contain an array of size 6, consisting of integers arr[i].
// Output format:
// Print a single integer, which is the count of prime numbers in the array.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < 6; i++) {
            int num = arr[i];

            if (num <= 1) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println(count);
    }
}
