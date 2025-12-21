class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int[] prefix = new int[n]; 
        int[] suffix = new int[n];
        int[] ans = new int[n];
        Arrays.fill(prefix, 1);
        Arrays.fill(ans, 1);
        Arrays.fill(suffix, 1);
        int j=n-2; 

        // prefix
        for(int i=1; i<n; i++) { 
            prefix[i] = prefix[i-1] * nums[i-1];  
            suffix[j] = suffix[j+1] * nums[j+1];  
            j--;
        }


        for(int i=0; i<nums.length; i++) { 
            ans[i] = prefix[i] * suffix[i]; 
        }

        return ans; 
    }
}