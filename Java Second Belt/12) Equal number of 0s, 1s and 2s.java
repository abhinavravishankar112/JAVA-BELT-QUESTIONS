// Given an input string that consists of only 0, 1 and 2.
// Write a program to print "Yes" if it has an equal number of 0, 1 and 2
// otherwise print "No".

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                count0++;
            } else if (ch == '1') {
                count1++;
            } else if (ch == '2') {
                count2++;
            }
        }

        if (count0 == count1 && count1 == count2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
