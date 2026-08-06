class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();

        list.add(nums[0]);
        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > list.get(list.size() - 1)) {
                list.add(nums[i]);
            } else {
                int idx = Collections.binarySearch(list, nums[i]);
                
                if(idx<0) { 
                    idx = -(idx+1);
                }

                list.set(idx, nums[i]); 
            }
        }

        return list.size();
    }
}