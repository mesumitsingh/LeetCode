class Solution {
    public int maxArea(int[] height) {
        int left=0, right=height.length-1, max=0; 
        while(left<right){
            int leftHand = height[left]; 
            int rightHand = height[right];
            int minHeight = Math.min(leftHand, rightHand);
            max = Math.max(max, minHeight*(right-left));
            if(leftHand<rightHand) left++;
            else right--;
        }
        return max; 
    }
}