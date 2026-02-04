//You are given a flowerbed represented as an integer array consisting of 0s and 1s, where 0 denotes an empty plot
//and 1 denotes a plot that already has a flower planted. Flowers cannot be planted in adjacent plots.
//Given an integer n, determine whether it is possible to plant n new flowers in the flowerbed
//without violating the no-adjacent-flowers rule. The input consists of the size of the flowerbed,
//the number of flowers to be planted, and the flowerbed array itself. The program should output true 
//if it is possible to plant all n flowers according to the rules, and false otherwise.
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int n = sc.nextInt();

        int[] flowerbed = new int[size];
        for (int i = 0; i < size; i++) {
            flowerbed[i] = sc.nextInt();
        }

        int count = 0;
        int zeros = 0;

        // treat imaginary 0s at both ends
        for (int i = 0; i <= size; i++) {
            if (i < size && flowerbed[i] == 0) {
                zeros++;
            } else {
                count += (zeros - 1) / 2;
                zeros = 0;
            }
        }

        System.out.println(count >= n ? "true" : "false");
    }
}
