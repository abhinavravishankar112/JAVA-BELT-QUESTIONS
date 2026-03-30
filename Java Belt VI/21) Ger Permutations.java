/*
The set [ 1 , 2 , 3 , . . . , n ] [1,2,3,...,n] contains a total of n ! n! unique permutations.
By listing and labeling all of the permutations in lexicographical order, we can determine the 
k t h k th permutation of the sequence. Given n n and k k, return the k t h k th permutation sequence.
*/
public static String getPermutation(int n, int k) {
    List<String> list = new ArrayList<>();
    boolean[] used = new boolean[n + 1];
    generate("", n, used, list);

    Collections.sort(list);
    return list.get(k - 1);
}

static void generate(String curr, int n, boolean[] used, List<String> list) {
    if (curr.length() == n) {
        list.add(curr);
        return;
    }

    for (int i = 1; i <= n; i++) {
        if (!used[i]) {
            used[i] = true;
            generate(curr + i, n, used, list);
            used[i] = false;
        }
    }
}
