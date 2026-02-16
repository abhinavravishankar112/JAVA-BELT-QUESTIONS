/*
Moving Stones Until Consecutive II
There are some stones placed at different positions on the X-axis.
You are given an integer array stones representing the positions of the stones.
Rules
A stone is called an endpoint stone if it has the smallest or largest position.
In one move, you may:
Pick up an endpoint stone
Move it to any unoccupied position
After moving, it must no longer be an endpoint stone
You cannot move a stone in such a way that it remains the smallest or largest stone.
*/
public static int[] numMovesStonesII(int[] stones) {

    Arrays.sort(stones);
    int n = stones.length;

    // ----- MAX moves -----
    int max = Math.max(
        stones[n - 1] - stones[1] - (n - 2),
        stones[n - 2] - stones[0] - (n - 2)
    );

    // ----- MIN moves -----
    int min = n;
    int left = 0;

    for (int right = 0; right < n; right++) {

        while (stones[right] - stones[left] + 1 > n) {
            left++;
        }

        int alreadyInside = right - left + 1;

        // special case
        if (alreadyInside == n - 1 &&
            stones[right] - stones[left] == n - 2) {
            min = Math.min(min, 2);
        } else {
            min = Math.min(min, n - alreadyInside);
        }
    }

    return new int[]{min, max};
}
0