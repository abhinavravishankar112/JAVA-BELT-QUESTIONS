// Given a string, eliminate all “b” and “ac” in the string,
// replace them in-place and iterate over the string once.
// Input Format: A string str consisting of lowercase English letters.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == 'b') {
                i++;
            } else if (str.charAt(i) == 'a' && i + 1 < str.length() && str.charAt(i + 1) == 'c') {
                i += 2;
            } else {
                result += str.charAt(i);
                i++;
            }
        }

        System.out.println(result);
    }
}
