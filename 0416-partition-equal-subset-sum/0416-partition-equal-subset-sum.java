class Solution {
    Boolean[][] dp;

    public boolean solve(int[] nums, int i, int tar) {

        if (tar == 0)
            return true;

        if (i >= nums.length)
            return false;

        if (dp[i][tar] != null)
            return dp[i][tar];

        boolean take = false;

        if (tar >= nums[i]) {
            take = solve(nums, i + 1, tar - nums[i]);
        }

        boolean not_take = solve(nums, i + 1, tar);

        dp[i][tar] = take || not_take;

        return dp[i][tar];
    }

    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int num : nums)
            sum += num;

        if (sum % 2 != 0)
            return false;

        int target = sum / 2;

        dp = new Boolean[nums.length][target + 1];

        return solve(nums, 0, target);
    }
}