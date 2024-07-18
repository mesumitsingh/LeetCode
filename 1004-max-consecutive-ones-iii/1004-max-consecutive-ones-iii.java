class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length, j=0, i=0, result=0, countZeroes=0;
        
        while(j<n){
            
            if(nums[j]==0){
                countZeroes++;
            }


            while(countZeroes>k){
                
                if(nums[i]==0){
                    countZeroes--;
                }
                i++;                
            }

            result=Math.max(result, j-i+1); 
            j++;
        }
        return result; 
    }
}