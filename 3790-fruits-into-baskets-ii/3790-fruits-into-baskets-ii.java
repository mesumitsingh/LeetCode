class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> list = new ArrayList<>();
        int total=0;
        for(int num: baskets) { 
            list.add(num);
            total++;
        }
        
        for(int i=0; i<fruits.length; i++) { 
            for(int j=0; j<list.size(); j++) { 
                if(fruits[i]<=list.get(j)) {
                    list.remove(list.get(j));
                    total--;
                    break;
                }    
            }
        }
        return total;
    }
}