// Write a program to initialise an array of size 10 and print the even elements.
// Example-1: Input: 2 3 4 5 6 7 8 9 3 7
// Output: 2 4 6 8
// Explanation: Only even elements are printed from the given array of size 10.
// Example-2: Input: 12 13 14
// Output: 12 14
// Explanation: Only even elements are printed from the given array of size 3.

import java.util.Scanner;

public class EvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
