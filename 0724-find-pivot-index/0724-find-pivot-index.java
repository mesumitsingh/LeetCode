class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0, leftSum=0, rightSum=0; 

        for(int num: nums){
            sum += num; 
        }

        for(int i=0; i<nums.length; i++){
            rightSum = sum - nums[i] - leftSum; 
            
            if(rightSum == leftSum){
                return i; 
            }

            leftSum += nums[i];
        }
        
        return -1; 
    }
}