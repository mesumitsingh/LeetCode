class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length, i=0, j=0, countZeroes=0, result=0; 

        while(j<n){
            if(nums[j]==0){
                countZeroes++;
            }

            while(countZeroes>1){
                if(nums[i]==0){
                    countZeroes--;
                }
                i++;
            }

            result=Math.max(result, j-i+1); 
            j++; 
        }
        return result-1;
    }
}