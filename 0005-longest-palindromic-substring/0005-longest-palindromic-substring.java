public class Solution {

    public String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = Integer.MIN_VALUE;
        int startingIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (solve(s, i, j)) {
                    if (j - i + 1 > maxlen) {
                        startingIndex = i;
                        maxlen = j - i + 1;
                    }
                }
            }
        }

        return s.substring(startingIndex, startingIndex + maxlen);
    }

    private boolean solve(String s, int l, int r) {
        if (l >= r) {
            return true;
        }

        if (s.charAt(l) == s.charAt(r)) {
            return solve(s, l + 1, r - 1);
        }

        return false;
    }
}