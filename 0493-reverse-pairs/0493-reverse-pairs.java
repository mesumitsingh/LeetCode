class Solution {
    private int[] nums;
    private int[] tempArray;

    public int reversePairs(int[] nums) {
        this.nums = nums;
        int length = nums.length;
        this.tempArray = new int[length];
      
        return mergeSort(0, length - 1);
    }

    private int mergeSort(int left, int right) {
        if (left >= right) {
            return 0;
        }
      
        int mid = (left + right) >> 1;
      
        int reversePairCount = mergeSort(left, mid) + mergeSort(mid + 1, right);
      
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j] * 2L) {
                i++;
            } else {
                reversePairCount += mid - i + 1;
                j++;
            }
        }
      
        i = left;
        j = mid + 1;
        int tempIndex = 0;
      
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                tempArray[tempIndex++] = nums[i++];
            } else {
                tempArray[tempIndex++] = nums[j++];
            }
        }
      
        while (i <= mid) {
            tempArray[tempIndex++] = nums[i++];
        }
      
        while (j <= right) {
            tempArray[tempIndex++] = nums[j++];
        }
      
        for (i = left; i <= right; i++) {
            nums[i] = tempArray[i - left];
        }
      
        return reversePairCount;
    }
}
