class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int i=0; i<nums.length; i++) { 
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int max_freq = 0;
        int key = 0;
        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) { 
            if(entry.getValue() > max) { 
                key = entry.getKey(); 
                max = entry.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) { 
            if(entry.getValue() == max){ 
                max_freq+=max;
            }
        }

        return max_freq;
    }
}