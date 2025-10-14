class Solution {

    public boolean isIncreasing(List<Integer> nums, int start, int end) { 
        for(int i=start; i<end-1; i++) { 
            if(nums.get(i) >= nums.get(i+1)) { 
                return false; 
            }
        }
        return true; 
    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        boolean first, second;
        
        for(int i=0; i<=nums.size() - 2*k; i++) { 
            first = isIncreasing(nums, i, i+k); 
            second = isIncreasing(nums, i+k, i+k*2);
            
            if(first && second) return true;
        }


        return false;
    }
}