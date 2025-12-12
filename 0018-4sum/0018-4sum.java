import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList();

        Arrays.sort(nums);

        for (int i = 0; i < n-3; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;

            for (int j = i + 1; j < n-2; j++) {
                if(j>i+1 && nums[j] == nums[j-1]) continue;
               
                int k= j+1;
                int l=n-1;
                while (k<l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        
                        while(k<l && nums[k] == nums[k-1]) k++; 
                        while(k<l && nums[l] == nums[l+1]) l--; 
                    }
                }
            }
        }

        return list;
    }
}