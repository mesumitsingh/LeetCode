class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int[] lastIndex = new int[10001]; 
        int length = nums.length; 
        int[] prefixSum = new int[length + 1]; 
      
        for (int i = 0; i < length; ++i) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
      
        int maxSum = 0; 
        int windowStart = 0; 
      
        for (int i = 1; i <= length; ++i) {
            int value = nums[i - 1]; 
            windowStart = Math.max(windowStart, lastIndex[value]); 
            
            maxSum = Math.max(maxSum, prefixSum[i] - prefixSum[windowStart]);
            lastIndex[value] = i; 
        }
      
        return maxSum;
    }
}
