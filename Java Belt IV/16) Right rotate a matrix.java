//The input consists of two lines. 
// The first line contains two integers n and, where n is the number of elements in the array, 
// and is the number of positions to right rotate.The second line contains n space. separated integers. 
// representing the elements of the array.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of elements
        int k = sc.nextInt();   // rotation count

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Important: handle large k
        k = k % n;

        // Right rotation
        for (int r = 0; r < k; r++) {
            int last = arr[n - 1];  // store last element

            // shift elements right
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
