/*
You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters. Return the maximum possible length of s.
A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
*/
public static int maxLength(List<String> arr) {
    return helper(arr, "", 0);
}

public static int helper(List<String> arr, String current, int index) {

    // check if current string has duplicate chars
    if (!isUnique(current)) return 0;

    int max = current.length();

    for (int i = index; i < arr.size(); i++) {
        max = Math.max(max, helper(arr, current + arr.get(i), i + 1));
    }

    return max;
}

public static boolean isUnique(String s) {
    int[] freq = new int[26];

    for (char c : s.toCharArray()) {
        if (freq[c - 'a'] > 0) return false;
        freq[c - 'a']++;
    }

    return true;
}