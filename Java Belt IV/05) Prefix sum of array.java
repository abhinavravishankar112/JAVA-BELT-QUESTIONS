// Given an array arr[] of size N, find the prefix sum of the array.
// A prefix sum array is another array prefixSum[] of the same size,
// such that the value of prefixSum[i] is arr[0] + arr[1] + ... + arr[i].

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate prefix sum in place
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        // Print the prefix sum array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
