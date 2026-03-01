//You are given an integer array nums and an integer k. In one operation, you can pick two numbers from the array whose sum equals k
// and remove them from the array. Your task is to return the maximum number of operations you can perform on the array.
public static int maxOperations(int[] nums, int k) {

    Arrays.sort(nums);

    int left = 0;
    int right = nums.length - 1;
    int count = 0;

    while (left < right) {

        int sum = nums[left] + nums[right];

        if (sum == k) {
            count++;
            left++;
            right--;
        } 
        else if (sum < k) {
            left++;
        } 
        else {
            right--;
        }
    }

    return count;
}