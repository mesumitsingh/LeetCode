class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        
        long num = n;
        while (num > 1) {
            if (num % 2 != 0) {
                return false;
            }
            num /= 2;
        }
        
        return true;
    }
}