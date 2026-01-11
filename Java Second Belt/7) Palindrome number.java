// Write a program to determine if a given integer is a palindrome number or not.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();            // read number
        String num = String.valueOf(n); // convert to string
        String reversed = "";

        // reverse using for loop
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed += num.charAt(i);
        }

        // compare original and reversed
        if (num.equals(reversed)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
