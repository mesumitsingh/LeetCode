class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] newNums = new int[n];

        for(int i=0; i<n-1; i++) { 
            for(int j=0; j<newNums.length-1; j++) { 
                newNums[j] = (nums[j] + nums[j+1])%10;
            }
            nums=newNums;
        }
        
        return newNums[0];
    }
}