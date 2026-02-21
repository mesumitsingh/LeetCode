class Solution {

    public void getUniqueSubsets(int[] nums, List<List<Integer>> allSubsets, List<Integer> ans, int i) {
        if (i == nums.length) {
            allSubsets.add(new ArrayList<>(ans));
            return;
        }

        // include 
        ans.add(nums[i]);
        getUniqueSubsets(nums, allSubsets, ans, i + 1);

        // backtrack
        ans.remove(ans.size() - 1);

        // exclude
        // exclude duplicates
        int idx = i + 1;
        while (idx < nums.length && nums[idx] == nums[idx - 1]) {
            idx++;
        }

        getUniqueSubsets(nums, allSubsets, ans, idx);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> allSubsets = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        getUniqueSubsets(nums, allSubsets, ans, 0);

        return allSubsets;
    }
}