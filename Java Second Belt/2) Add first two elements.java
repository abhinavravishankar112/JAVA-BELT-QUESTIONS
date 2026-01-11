// Write a program to take one input as int which is the number of elements in the array
// and the next input the array, add the first 2 elements and print output.

import java.util.Scanner;

public class SumFirstTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n >= 2) {
            int sum = arr[0] + arr[1];
            System.out.println(sum);
        } else {
            System.out.println("Need at least 2 elements");
        }
    }
}
