// Given the array nums consisting of 2N elements in the form
// [x1, x2, ..., xn, y1, y2, ..., yn].
// Return the array in the form [x1, y1, x2, y2, ..., xn, yn].
// Input Format:
// The first line of input contains the size of an array 2N
// The second line has the elements of an array
// The third line has the value of N

import java.util.Scanner;

public class ShuffleArrayEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        // Directly print the shuffled result
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " " + nums[i + n] + " ");
        }
    }
}
