class Solution {

    public Set<List<Integer>> set = new HashSet<>();
    
    public void getAllCombinations(int[] arr, int idx, int target, List<Integer> combination, List<List<Integer>> ans) { 

        if(idx==arr.length || target<0) { 
            return;
        }

        if(target==0) {
            if(!set.contains(combination)) { 
                ans.add(new ArrayList<>(combination)); 
                set.add(combination);
            }
            return;
        }

        combination.add(arr[idx]); 
        getAllCombinations(arr, idx+1, target-arr[idx], combination, ans); // single choice
        getAllCombinations(arr, idx, target-arr[idx], combination, ans);  // multiple choice

        combination.remove(combination.size()-1); // backtracking 

        getAllCombinations(arr, idx+1, target, combination, ans); // don't include the element

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combination = new ArrayList<>(); 
        List<List<Integer>> ans = new ArrayList<>(); 

        getAllCombinations(candidates, 0, target, combination, ans);

        return ans;
    }
}