// Given two sorted arrays, write a program to merge them into a third array
// while keeping the elements in sorted order.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n1) {
            c[k++] = a[i++];
        }

        while (j < n2) {
            c[k++] = b[j++];
        }

        for (int x = 0; x < c.length; x++) {
            System.out.print(c[x] + " ");
        }
    }
}
