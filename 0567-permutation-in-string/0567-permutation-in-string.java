class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] freq1 = new char[26];

        for(int i=0; i<s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        for(int i=0; i<=s2.length()-s1.length(); i++) {
            char[] freq2 = new char[26];

            for(int j=0; j<s1.length(); j++) { 
                freq2[s2.charAt(i + j) - 'a']++; 
            }

            if(Arrays.equals(freq1, freq2)) return true; 
            
        }

        return false;

    }
}