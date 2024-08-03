class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int num: target){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: arr){
            Integer count = map.get(num); 
            if(count==null || count==0){
                return false; 
            } else{ 
                map.put(num, count-1);
            }
        }
        return true; 
    }
}