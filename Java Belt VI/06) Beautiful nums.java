//You are given an array nums of positive integers and a positive integer k. A subset of nums is beautiful if it does not contain 
//two integers with an absolute difference equal to k. Return the number of non-empty beautiful subsets of the array nums.
//A subset of nums is an array that can be obtained by deleting some (possibly none) elements from nums. Two subsets are different
//if and only if the chosen indices to delete are different.
public static int beautifulSubsets(int[] nums, int k) {

    return backtrack(nums, k, 0, new HashMap<>()) - 1;
}

private static int backtrack(int[] nums, int k, int index, HashMap<Integer, Integer> map) {

    if (index == nums.length) {
        return 1;
    }

    // option 1: skip current number
    int count = backtrack(nums, k, index + 1, map);

    // option 2: include current number (if valid)
    int num = nums[index];

    if (!map.containsKey(num - k) && !map.containsKey(num + k)) {

        map.put(num, map.getOrDefault(num, 0) + 1);

        count += backtrack(nums, k, index + 1, map);

        // remove after recursion
        map.put(num, map.get(num) - 1);
        if (map.get(num) == 0) {
            map.remove(num);
        }
    }

    return count;
}
