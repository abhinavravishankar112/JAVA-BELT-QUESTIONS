/*Given an integer array nums of length n and an integer target, find three integers in nums such that their sum is closest to target. 
Return the sum of the three integers. You may assume that each input will have exactly one solution. */
public int threeSumClosest(int[] nums, int target) {

    Arrays.sort(nums);

    int closest = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length - 2; i++) {

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[i] + nums[left] + nums[right];

            // update closest
            if (Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum;
            }

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return sum; // exact match
            }
        }
    }

    return closest;
}