// https://leetcode.com/problems/combination-sum-ii/?envType=problem-list-v2&envId=backtracking

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

        private void backtrack(int[] candidates, int remaining, int start, List<Integer> current, List<List<Integer>> result){
            if(remaining == 0){
                result.add(new ArrayList<>(current));
                return;
            }
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
                if(candidates[i] > remaining) break;
                current.add(candidates[i]);

                backtrack(candidates, remaining - candidates[i], i + 1, current, result);
                current.remove(current.size()-1);
            }
        }
    }