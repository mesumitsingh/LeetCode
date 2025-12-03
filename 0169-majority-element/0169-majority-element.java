class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int max = Integer.MIN_VALUE, result=-1; 

        for(int num : nums) { 
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Integer key : map.keySet()) { 
            Integer value = map.get(key); 
            if(value>max) { 
                max = value; 
                result = key; 
            }
        }

        return result;
    }
}