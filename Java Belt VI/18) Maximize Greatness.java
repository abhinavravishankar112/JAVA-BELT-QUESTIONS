/*
You are given a 0-indexed integer array nums. You are allowed to permute nums into a new array perm of your choosing.
We define the greatness of nums as the number of indices i (0 ≤ i < nums.length) for which perm[i] > nums[i].
👉 Your task is to return the maximum possible greatness you can achieve after permuting nums.
*/
public static int maximizeGreatness(int[] nums) {
    Arrays.sort(nums);

    int i = 0, j = 0;
    int count = 0;

    while (j < nums.length) {
        if (nums[j] > nums[i]) {
            count++;
            i++;
        }
        j++;
    }

    return count;
}
