/*Suppose you have n integers labeled from 1 through n. A permutation of those n integers perm (1-indexed)
is considered a beautiful arrangement if for every index i (1 ≤ i ≤ n), either of the following is true:
perm[i] is divisible by i
i is divisible by perm[i]
Given an integer n, return the number of beautiful arrangements that can be constructed.*/
public static int countArrangement(int n) {
    boolean[] used = new boolean[n + 1];
    return backtrack(n, 1, used);
}

private static int backtrack(int n, int position, boolean[] used) {

    if (position > n) {
        return 1;
    }

    int count = 0;

    for (int num = 1; num <= n; num++) {

        if (!used[num] && 
           (num % position == 0 || position % num == 0)) {

            used[num] = true;

            count += backtrack(n, position + 1, used);

            used[num] = false; // undo choice
        }
    }

    return count;
}