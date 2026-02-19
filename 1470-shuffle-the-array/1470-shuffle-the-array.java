class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length]; 
        int idx=0, i=0, j=n; 

        while(idx<nums.length){ 
            result[idx++] = nums[i++];
            result[idx++] = nums[j++]; 

        }    

        return result;
    }
}