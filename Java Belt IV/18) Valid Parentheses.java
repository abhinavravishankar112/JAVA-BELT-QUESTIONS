//An input string is valid if: Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. Every close bracket has a corresponding open bracket of the same type.

import java.util.*;

public class Solution {   // change to Main if needed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();   // input string

        Stack<Character> stack = new Stack<>();
        boolean valid = true;

        for (char ch : s.toCharArray()) {

            // If opening bracket → push expected closing
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');

            // If closing bracket → check stack
            else {
                if (stack.isEmpty() || stack.pop() != ch) {
                    valid = false;
                    break;
                }
            }
        }

        // Final check
        if (!stack.isEmpty()) valid = false;

        System.out.println(valid ? "Valid" : "Invalid");
    }
}
