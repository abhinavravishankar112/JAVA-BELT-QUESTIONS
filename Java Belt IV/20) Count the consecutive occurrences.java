//Input Format: A single line containing a string S (1= S <=1000 where |S| is the length of the string. 
// The string can contain alphabets (both lowercase and uppercase). digits, spaces, and special characters.

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine();
        
        if (s == null || s.length() == 0) {
            System.out.println(s);
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1));
        compressed.append(count);

        String result = compressed.toString();
        if (result.length() < s.length()) {
            System.out.println(result);
        } else {
            System.out.println(s);
        }
    }
}