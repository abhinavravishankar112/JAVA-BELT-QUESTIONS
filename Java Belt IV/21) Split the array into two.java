//• The first line contains an integer n, representing the number of elements in the array. 
// • The second line contains n space-separated integers, representing the elements of the array. 
// • The third line contains an integer x, the threshold value for splitting.

import java.util.*;

public class Solution {   // change to Main if needed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // First print ≤ x
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                System.out.print(arr[i] + " ");
            }
        }

        // Then print > x
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

