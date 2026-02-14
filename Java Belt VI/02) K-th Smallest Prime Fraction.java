/*
K-th Smallest Prime Fraction
You are given a sorted integer array arr of size n.
The array contains 1 and prime numbers only
All elements in arr are unique
The array is sorted in strictly increasing order
You are also given an integer k.
For every pair of indices (i, j) such that:
0 ≤ i < j < arr.length
we form a fraction:
arr[i] / arr[j]
Among all such fractions, return the k-th smallest fraction.
*/
public static int[] kthSmallestPrimeFraction(int[] arr, int k) {

    int n = arr.length;

    List<int[]> list = new ArrayList<>();

    // generate all fractions
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            list.add(new int[]{arr[i], arr[j]});
        }
    }

    // sort manually using simple bubble sort
    for (int i = 0; i < list.size(); i++) {
        for (int j = 0; j < list.size() - 1; j++) {

            int[] f1 = list.get(j);
            int[] f2 = list.get(j + 1);

            // compare f1[0]/f1[1] and f2[0]/f2[1]
            if ((double) f1[0] / f1[1] > (double) f2[0] / f2[1]) {
                list.set(j, f2);
                list.set(j + 1, f1);
            }
        }
    }

    return list.get(k - 1);
}

