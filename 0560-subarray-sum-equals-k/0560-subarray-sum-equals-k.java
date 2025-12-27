class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n]; 
        prefixSum[0] = nums[0];
        int ans=0; 

        for(int i=1; i<n; i++) { 
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int j=0; j<n; j++) { 
            int temp = prefixSum[j]-k; 

            if(map.containsKey(temp)) { 
                ans += map.get(temp); 
            } 
            
            if(prefixSum[j]==k) { 
                ans++; 
            } 
            
            map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0) +1);
        }

        return ans; 
    }
}