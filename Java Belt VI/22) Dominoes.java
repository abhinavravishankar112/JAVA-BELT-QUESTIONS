/*
There are n dominoes in a line, placed vertically. Initially, some dominoes are pushed left (L) or right (R). Each second, a falling domino pushes the next one in the same direction. If a domino is pushed from both sides, it stays upright (.).

Given a string dominoes representing the initial state:
'L' → pushed left
'R' → pushed right
'.' → not pushed

Return the final state of the dominoes.
*/
public String pushDominoes(String dominoes) {
    int n = dominoes.length();
    char[] arr = dominoes.toCharArray();

    for (int i = 0; i < n; i++) {
        if (arr[i] == 'R') {
            int j = i + 1;

            while (j < n && arr[j] == '.') j++;

            if (j < n && arr[j] == 'L') {
                int left = i + 1, right = j - 1;
                while (left < right) {
                    arr[left++] = 'R';
                    arr[right--] = 'L';
                }
            } else {
                for (int k = i + 1; k < j; k++) {
                    arr[k] = 'R';
                }
            }
            i = j - 1;
        }
    }

    return new String(arr);
}