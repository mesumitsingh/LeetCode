class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                k++; 
                i++;
            } else {
                merged[k] = nums2[j];
                k++; 
                j++; 
            }
        }

        while (i < n1) { 
            merged[k] = nums1[i];
            k++; 
            i++;
        }
        while (j < n2) {
            merged[k] = nums2[j];
            k++; 
            j++; 
        }


        // merge
        int n = merged.length;

        if (n % 2 == 0) {
            double median = (merged[n / 2] + merged[n / 2 - 1]) / 2.0;
            return median;
        } else {
            return merged[n / 2];
        }
    }
}