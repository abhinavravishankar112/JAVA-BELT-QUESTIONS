/*You are given an array people where people[i] is the weight of the iᵗʰ person, and an integer limit representing the maximum weight a boat can carry.
Each boat can carry at most two people at the same time, provided the sum of their weights is at most limit.
Return the minimum number of boats required to carry all the people.*/
public static int numRescueBoats(int[] people, int limit) {

    Arrays.sort(people);

    int left = 0;
    int right = people.length - 1;
    int boats = 0;

    while (left <= right) {

        if (people[left] + people[right] <= limit) {
            left++;
        }

        right--;
        boats++;
    }

    return boats;
}