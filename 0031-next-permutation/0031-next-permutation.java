class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, pivot = -1;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                pivot = i - 1;
                break;
            }
        }

        if(pivot!=-1)
        {for(int i=n-1; i>pivot; i--) { 
            if(nums[i]>nums[pivot]) { 
                int temp = nums[i]; 
                nums[i] = nums[pivot]; 
                nums[pivot] = temp; 
                break;
            }
        }}




        int l=pivot+1, r=n-1; 

        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
}