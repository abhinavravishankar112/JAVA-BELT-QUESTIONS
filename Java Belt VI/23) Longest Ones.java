/*
Given a binary array nums and an integer k, you can flip at most k zeros to ones.

Return the maximum number of consecutive 1s that can be obtained after flipping at most k zeros.
*/
public static int longestOnes(int[] nums, int k) {
    int left = 0;
    int zeros = 0;
    int max = 0;

    for (int right = 0; right < nums.length; right++) {
        if (nums[right] == 0) {
            zeros++;
        }

        while (zeros > k) {
            if (nums[left] == 0) {
                zeros--;
            }
            left++;
        }

        max = Math.max(max, right - left + 1);
    }

    return max;
}