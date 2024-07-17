class Solution {
    public int maxVowels(String s, int k) {
        int count=0; 
        int result=0; 
        String vowels="aeiouAEIOU"; 


        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch)!=-1){
                count++;
            }
        }
        result = count; 

        for(int i=k; i<s.length(); i++){
            char end = s.charAt(i); 
            char start = s.charAt(i-k); 

            if(vowels.indexOf(end)!=-1){
                count++; 
            }

            if(vowels.indexOf(start)!=-1){
                count--; 
            }

            result = Math.max(result, count); 
        }
        return result;
    }
}