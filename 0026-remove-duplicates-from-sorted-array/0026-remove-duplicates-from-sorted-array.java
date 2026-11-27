class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i =0; 
        int k =1; 
        for(int j=i; j<nums.length; j++) { 
            if(nums[i] != nums[j]) { 
                i=j; 
                nums[k] = nums[i]; 
                k++; 
            }

        }

        return k; 

    }
}