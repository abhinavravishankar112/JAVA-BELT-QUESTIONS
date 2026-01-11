// You are given an array arr[] of size N.
// Your task is to write a program to find the suffix sum array,
// which is another array suffixSum[] of the same size,
// such that the value of suffixSum[i] is the sum of elements
// arr[i], arr[i+1], arr[i+2], ..., arr[N-1].

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] suffix = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        suffix[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = arr[i] + suffix[i + 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(suffix[i] + " ");
        }
    }
}
