class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length; 
        long ans = 1;
        long mod = (long) Math.pow(10,9) + 7;


        for (int i = 1; i < n; i++) {
            if (complexity[0] >= complexity[i]) {
                return 0;
            }

            ans = (ans * i) % mod;
        }

        return (int) ans;
    }
}