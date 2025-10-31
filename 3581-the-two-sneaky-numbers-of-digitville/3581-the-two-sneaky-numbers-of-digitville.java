class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int index = 0; 

        for(int num : nums) { 
            map.put(num, map.getOrDefault(num,0)+1);

            if(map.get(num) == 2) { 
                result[index++] = num; 
            }

            if(index == 2) break; 
        }

        return result; 

    }
}