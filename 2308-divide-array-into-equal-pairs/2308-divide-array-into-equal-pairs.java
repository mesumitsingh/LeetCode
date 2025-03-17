class Solution {
    public boolean divideArray(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - i - 1; j++){ 
                if(nums[j] > nums[j + 1]){ 
                    int temp = nums[j]; 
                    nums[j] = nums[j + 1]; 
                    nums[j + 1] = temp; 
                }
            }
        }

        for(int i = 0; i < nums.length - 1; i += 2){  
            if(nums[i] != nums[i + 1]){ 
                return false;
            }
        }

        return true;

    }
}