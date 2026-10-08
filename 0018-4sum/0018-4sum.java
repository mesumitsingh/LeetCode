class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n;) {
                int p = j + 1;
                int q = n - 1;
                while (p < q) {

                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p]);
                        temp.add(nums[q]);
                        list.add(temp);

                        p++;
                        q--;

                        while (p < q && nums[p] == nums[p - 1]) p++;

                    }

                }
                j++;
                while (j < n && nums[j] == nums[j - 1]) j++;

            }
        }

        return list;
    }
}