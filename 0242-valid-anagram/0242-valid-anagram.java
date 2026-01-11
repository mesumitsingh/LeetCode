class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; 

        HashMap<Character, Integer> map = new HashMap<>(); 
        HashMap<Character, Integer> map2 = new HashMap<>(); 

        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0; i<t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        
        return map.equals(map2) ? true : false;

    }
}