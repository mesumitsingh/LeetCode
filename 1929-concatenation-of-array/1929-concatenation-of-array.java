class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2]; 
        int j=0; 

        for(int i=0; i<nums.length*2; i++) { 
            result[i] = nums[j++];
            if(j==nums.length) j=0; 
        }

        return result; 
    }
}