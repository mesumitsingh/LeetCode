class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0; i<nums.length; i++) { 
            for(int num : nums) { 
                if(num == original) { 
                    original *= 2; 
                }
            }
        }

        return original;
    }
}