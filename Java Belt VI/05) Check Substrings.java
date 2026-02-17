//Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise. 
//In other words, return true if one of s1's permutations is the substring of s2.
public static boolean checkInclusion(String s1, String s2) {

    if (s1.length() > s2.length()) return false;

    int[] count1 = new int[26];
    int[] count2 = new int[26];

    // count characters of s1
    for (int i = 0; i < s1.length(); i++) {
        count1[s1.charAt(i) - 'a']++;
    }

    int windowSize = s1.length();

    for (int i = 0; i < s2.length(); i++) {

        // add current character to window
        count2[s2.charAt(i) - 'a']++;

        // remove character if window too big
        if (i >= windowSize) {
            count2[s2.charAt(i - windowSize) - 'a']--;
        }

        // compare arrays
        if (Arrays.equals(count1, count2)) {
            return true;
        }
    }

    return false;
}
