class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result[i] = result[i/2]+1; 
            } else { 
                result[i] = result[i/2];
            }

        }

        return result; 
    }
}