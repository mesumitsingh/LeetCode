class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int l=0, result=0, total=0;
        for(int i=0; i<fruits.length; i++) {  
            map.put(fruits[i], map.getOrDefault(fruits[i],0)+1);
            total++;

            while(map.size()>2) { 
                map.put(fruits[l], map.get(fruits[l]) - 1);
                total--;
                if(map.get(fruits[l])==0) { 
                    map.remove(fruits[l]);
                }

                l++;
            }

            result = Math.max(result, total);
        }
        
        return result;
    }
}