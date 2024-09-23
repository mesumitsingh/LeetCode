class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Set<String> st = new HashSet<>(Set.of(dictionary)); 

        int[] t = new int[n + 1]; 
        
        for (int i = n - 1; i >= 0; i--) {
            t[i] = 1 + t[i + 1]; 

            for (int j = i; j < n; j++) {
                String curr = s.substring(i, j + 1);
                if (st.contains(curr)) {
                    t[i] = Math.min(t[i], t[j + 1]); 
                }
            }
        }

        return t[0];
    }
}