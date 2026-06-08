/*
You have two baskets, and each basket can hold only one type of fruit.

Starting from any tree, collect exactly one fruit from each tree while moving to the right.
You must stop when you encounter a fruit type that cannot fit into your two baskets.

Return the maximum number of fruits that can be collected.
*/
public int totalFruit(int[] fruits) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int left = 0;
    int max = 0;

    for (int right = 0; right < fruits.length; right++) {
        map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

        while (map.size() > 2) {
            map.put(fruits[left], map.get(fruits[left]) - 1);

            if (map.get(fruits[left]) == 0) {
                map.remove(fruits[left]);
            }

            left++;
        }

        max = Math.max(max, right - left + 1);
    }

    return max;
}