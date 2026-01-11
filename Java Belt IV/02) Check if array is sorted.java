// Given an array of size n, write a program to check if the given array is sorted
// in (ascending / Increasing / Non-decreasing) order or not.
// If the array is sorted then return 1 if True, Else return 0 if False.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = 0;
                break;
            }
        }

        System.out.println(flag);
    }
}
