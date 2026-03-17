/*
Given an integer array nums of size n, write a program to find the length of the longest strictly increasing subsequence.
A subsequence is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
*/
public static int lengthOfLIS(int[] nums) {

    int n = nums.length;
    int[] dp = new int[n];
    Arrays.fill(dp, 1);

    int max = 1;

    for (int i = 1; i < n; i++) {

        for (int j = 0; j < i; j++) {

            if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                dp[i] = dp[j] + 1;
            }
        }

        if (dp[i] > max) {
            max = dp[i];
        }
    }

    return max;
}