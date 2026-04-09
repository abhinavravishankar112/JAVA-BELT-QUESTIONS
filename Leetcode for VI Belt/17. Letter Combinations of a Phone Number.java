//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=problem-list-v2&envId=backtracking

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return result;
        }
        
        String[] map = {
            "", "", "abc", "def",
            "ghi","jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };
        backtrack(result, map, digits, 0, "");
        return result;
    }
    private void backtrack(List<String> result, String[] map, String digits, int index, String current){

        if(index == digits.length()){
            result.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for(char ch : letters.toCharArray()){
            backtrack(result, map, digits, index + 1, current + ch);
        }
    }
}