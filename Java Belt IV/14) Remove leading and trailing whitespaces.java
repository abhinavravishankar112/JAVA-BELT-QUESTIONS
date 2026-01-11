// You are given a string that might contain leading and trailing white spaces.
// Your task is to write a program to remove these leading and trailing white spaces
// and return the modified string.
// You must not use any inbuilt functions to solve the problem.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        String result = "";

        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }

        System.out.println(result);
    }
}
