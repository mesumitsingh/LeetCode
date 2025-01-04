public class Solution {
    public int waysToSplitArray(int[] nums) {
        int suffix = 0;
        for(int i=0; i<nums.length; i++){ 
            suffix += nums[i];
        }
        
        int prefix = 0, count = 0;
        for(int i=0; i<nums.length-1; i++){ 
            prefix += nums[i]; 
            suffix -= nums[i]; 
            if(prefix >= suffix){ 
                count++;
            }
        }
        
        return count;
    }
}