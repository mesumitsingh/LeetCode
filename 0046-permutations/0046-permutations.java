class Solution {

    public void getPermutations(int[] nums, int idx, List<List<Integer>> ans) { 
      
        if(idx == nums.length) { 
            List<Integer> temp = new ArrayList<>(); 
            for(int num: nums) { 
                temp.add(num); 
            }
            ans.add(temp);
            return; 
        }

        for(int i=idx; i<nums.length; i++) { 
            swap(idx, i, nums);

            getPermutations(nums, idx+1, ans);

            swap(idx, i, nums);
        }

    }

    public void swap(int idx, int i, int[] nums) { 
        int temp = nums[idx]; 
        nums[idx] = nums[i];
        nums[i] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 

        getPermutations(nums, 0, ans);   

        return ans; 

    }

}