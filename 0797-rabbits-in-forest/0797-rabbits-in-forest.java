class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : answers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int rabbits = 0;
        for (int key : map.keySet()) {
            if (key == 0) {
                rabbits += map.get(key);
            } else{ 
                int groups = (int) Math.ceil((double) map.get(key) / (key + 1));
                rabbits += (key + 1) * groups;
            }
        }
        return rabbits;
    }
}