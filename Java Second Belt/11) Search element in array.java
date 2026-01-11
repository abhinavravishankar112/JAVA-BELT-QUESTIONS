// Given an array of integers nums, write a program to find the index of an element x.
// If it doesn't exist, return -1.
// Input Format:
// The first line of input contains the size of array N
// The second line of input contains the elements in the array nums
// The third line of input contains the element to be searched x

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
