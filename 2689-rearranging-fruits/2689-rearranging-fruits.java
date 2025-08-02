class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int n = basket1.length; 
        Map<Integer, Integer> fruitCountMap = new HashMap<>(); 
      
        
        for (int i = 0; i < n; ++i) {
            fruitCountMap.merge(basket1[i], 1, Integer::sum);  
            fruitCountMap.merge(basket2[i], -1, Integer::sum); 
        }
      
        int minFruitValue = Integer.MAX_VALUE; 
        List<Integer> fruitDifferences = new ArrayList<>(); 
      
        for (var entry : fruitCountMap.entrySet()) {
            int fruit = entry.getKey(), count = entry.getValue();
            if (count % 2 != 0) { 
                return -1;
            }
            for (int i = Math.abs(count) / 2; i > 0; --i) {
                fruitDifferences.add(fruit);  
            }
            minFruitValue = Math.min(minFruitValue, fruit); 
        }
      
        Collections.sort(fruitDifferences); 
      
        int m = fruitDifferences.size(); 
        long totalCost = 0; 
      
        for (int i = 0; i < m / 2; ++i) {
                totalCost += Math.min(fruitDifferences.get(i), minFruitValue * 2); 
        }
      
        return totalCost; 
    }
}