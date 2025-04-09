class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> distinct = new HashSet<>();
        for (int num : nums) {
            if (num < k) {
                return -1;
            } else if (num > k) {
                distinct.add(num);
            }
        }
        return distinct.size();
    }
}