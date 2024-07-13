class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean result = false; 
        int k=0; 
        if(s.isEmpty()){
            return true; 
        }
        outerLoop: 
        for(int i=0; i<s.length(); i++){
            for(int j=k; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    k = j+1; 
                    result = true; 
                    continue outerLoop;
                }
            }
            result = false; 
            break;
        }
        return result;
    }
}