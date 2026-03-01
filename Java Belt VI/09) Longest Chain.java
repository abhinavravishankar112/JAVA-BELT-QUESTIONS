/* You are given an array of n pairs, pairs[i] = [left, right], where left < right. A pair [c, d] follows a pair [a, b] if b < c. 
You need to form the longest chain of such pairs. A chain can be formed by selecting pairs in any order. Return the length of the 
longest chain that can be formed.
*/
public static int findLongestChain(int[][] pairs) {

    Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

    int count = 0;
    int currentEnd = Integer.MIN_VALUE;

    for (int i = 0; i < pairs.length; i++) {

        if (pairs[i][0] > currentEnd) {
            count++;
            currentEnd = pairs[i][1];
        }
    }

    return count;
}