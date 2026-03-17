/*
You are given a string STR containing lowercase English letters from a to z inclusive. Your task is to find all non-empty possible subsequences of STR.
A subsequence of a string is a sequence derived by deleting some or no characters from the string without changing the order of the remaining characters.
*/
public static void solve(int i, String s, String f, List<String> svt) {

    if (i == s.length()) {
        if (!f.equals("")) {
            svt.add(f);
        }
        return;
    }

    // include current character
    solve(i + 1, s, f + s.charAt(i), svt);

    // exclude current character
    solve(i + 1, s, f, svt);
}