/*
Given N pairs of parentheses, write a program to generate all combinations of well-formed parentheses and print them in lexicographically increasing order.
A well-formed parentheses combination is one where the parentheses are correctly balanced.
*/
public static List<String> generateParenthesis(int n) {

    List<String> result = new ArrayList<>();
    generate("", 0, 0, n, result);
    return result;
}

public static void generate(String current, int open, int close, int n, List<String> result) {

    if (current.length() == n * 2) {
        result.add(current);
        return;
    }

    if (open < n) {
        generate(current + "(", open + 1, close, n, result);
    }

    if (close < open) {
        generate(current + ")", open, close + 1, n, result);
    }
}