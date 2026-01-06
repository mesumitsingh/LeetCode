class Solution {
    public int search(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // left 
            if (arr[st] <= arr[mid]) {
                if (arr[st] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } 
            // right 
            else {
                if (arr[mid] < target && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
