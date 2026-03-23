/*
Given an integer array nums, return true if you can partition the array into two subsets such that
the sum of the elements in both subsets is equal, or false otherwise.
*/
public static boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) sum += num;

    if (sum % 2 != 0) return false;

    return helper(nums, 0, sum / 2);
}

public static boolean helper(int[] nums, int index, int target) {
    if (target == 0) return true;
    if (index >= nums.length || target < 0) return false;

    // take or skip
    return helper(nums, index + 1, target - nums[index]) ||
           helper(nums, index + 1, target);
}