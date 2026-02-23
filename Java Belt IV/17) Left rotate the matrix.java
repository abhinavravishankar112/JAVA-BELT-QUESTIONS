//The input consists of two lines. 
// The first line contains two integers n and, where n is the number of elements in the array, 
// and is the number of positions to left rotate.The second line contains n space. separated integers. 
// representing the elements of the array.

import java.util.*;

public class Solution {   // use Main if file is Main.java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        k = k % n;  // important for large k

        // Left rotation logic
        for (int i = 0; i < n; i++) {
            res[i] = arr[(i + k) % n];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
