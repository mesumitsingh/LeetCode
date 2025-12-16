class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[256];

            for (int j = i; j < s.length(); j++) {

                char c = s.charAt(j);

                if (seen[c]) {
                    break;
                }

                seen[c] = true;
                maxlen = Math.max(maxlen, j - i+1);
            }
        }

        return maxlen;
    }
}