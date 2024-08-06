class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxK = -1; 

        for(int num: nums){ 
            set.add(num);
        }

        for(int num: nums){
            if(set.contains(-num) && num > maxK){
                maxK = num;
            }
        }

        return maxK;
    }
}