class Solution {
    public String reverseWords(String s) {
        s = s.trim(); 

        String[] str = s.split("\\s+"); 
        int i=0, j=str.length-1; 
        while(i<j){
            String temp = str[i]; 
            str[i] = str[j]; 
            str[j] = temp; 
            i++; 
            j--;
        }
        return String.join(" ", str).trim(); 
    }
}