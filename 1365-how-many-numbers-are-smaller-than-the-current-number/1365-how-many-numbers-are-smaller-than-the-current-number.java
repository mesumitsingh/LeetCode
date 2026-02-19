class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
            count=0; 
        }

        return result;
    }
}