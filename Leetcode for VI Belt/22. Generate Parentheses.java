// https://leetcode.com/problems/generate-parentheses/description/?envType=problem-list-v2&envId=backtracking

class Solution {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack("", 0, 0, n);
        return result;
    }
    private void backtrack(String current, int open, int close, int n){
        if(current.length() == 2 * n){
        result.add(current);
        return;
        }

        if(open < n){
            backtrack(current + "(", open + 1, close, n);
        }
        if(close < open){
            backtrack(current + ")", open, close + 1, n);
        }
    }
}