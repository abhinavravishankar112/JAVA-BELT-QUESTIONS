/*
Given a string containing digits from 2–9 inclusive, write a program to print all possible letter combinations that the number could represent.
The digits map to letters on a telephone keypad as follows:
2 → abc
3 → def
4 → ghi
5 → jkl
6 → mno
7 → pqrs
8 → tuv
9 → wxyz
Note that 1 does not map to any letters.
Print the answer in lexicographically increasing order.
*/
public static List<String> letterCombinations(String digits) {

    List<String> result = new ArrayList<>();

    if (digits.length() == 0) return result;

    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    result.add("");

    for (char d : digits.toCharArray()) {

        String letters = map[d - '0'];
        List<String> temp = new ArrayList<>();

        for (String s : result) {
            for (char c : letters.toCharArray()) {
                temp.add(s + c);
            }
        }

        result = temp;
    }

    return result;
}