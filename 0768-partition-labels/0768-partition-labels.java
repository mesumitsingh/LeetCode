class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>(); 
        Map<Character, Integer> map = new HashMap<>(); 

        for(int i=0; i<s.length(); i++){ 
            char c = s.charAt(i); 
            map.put(c, i); 
        }

        int prev = -1; 
        int maxi = 0; 

        for(int i=0; i<s.length(); i++){ 
            maxi = Math.max(maxi, map.get(s.charAt(i)));
            if(i == maxi){ 
                list.add(maxi - prev);
                prev = maxi;
            }
        }
        return list;
    }
}