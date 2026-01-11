// You are given a string.
// Your task is to find the character(s) with the highest and lowest
// frequency in the string.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int max = 0, min = Integer.MAX_VALUE;
        char maxChar = ' ', minChar = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch] > max) {
                max = freq[ch];
                maxChar = ch;
            }

            if (freq[ch] < min && freq[ch] > 0) {
                min = freq[ch];
                minChar = ch;
            }
        }

        System.out.println("Highest Frequency Character: " + maxChar);
        System.out.println("Lowest Frequency Character: " + minChar);
    }
}
