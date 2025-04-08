class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int n = nums.length; 
        for(int i=n-1; i>=0; i--){ 
            if(seen.contains(nums[i])){ 
                return i/3 + 1; 
            }
            seen.add(nums[i]);
        }
        return 0; 
    }
}