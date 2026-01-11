// You are given a string and a word.
// Your task is to write a program to remove the first occurrence
// of the given word from the string.
// No library function should be used to solve this problem.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String word = sc.nextLine();

        int index = -1;

        for (int i = 0; i <= str.length() - word.length(); i++) {
            int j;
            for (j = 0; j < word.length(); j++) {
                if (str.charAt(i + j) != word.charAt(j)) {
                    break;
                }
            }
            if (j == word.length()) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (i < index || i >= index + word.length()) {
                    result += str.charAt(i);
                }
            }
            System.out.println(result);
        } else {
            System.out.println(str);
        }
    }
}
