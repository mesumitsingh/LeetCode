class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int ans = 0;

        for (char c = 'a'; c <= 'z'; c++) {

            int left = s.indexOf(c);
            int right = s.lastIndexOf(c);

            if (left == -1 || left == right) continue;

            boolean[] seen = new boolean[26];

            for (int i = left + 1; i < right; i++) {
                seen[s.charAt(i) - 'a'] = true;
            }

            for (boolean x : seen) {
                if (x) ans++;
            }
        }

        return ans;
    }
}
