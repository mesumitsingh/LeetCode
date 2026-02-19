class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        long count=0, result=0; 
        for(int i=0; i<nums.length; i++) { 
            if(nums[i]==1) { 
                count++;
                result = Math.max(count, result); 
            } else { 
                count=0;
            }
        }
        
        return (int) result;
    }
}