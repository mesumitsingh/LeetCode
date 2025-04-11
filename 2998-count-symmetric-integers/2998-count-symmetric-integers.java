class Solution {
    public int countSymmetricIntegers(int low, int high) {
                int result = 0;
        for (int i = low; i <= high; i++) {
            String num = Integer.toString(i);
            int n = num.length();
            if (n % 2 == 0) {
                int firstSum = 0, lastSum = 0;
                for (int j = 0; j < n / 2; j++) {
                    firstSum += num.charAt(j) - '0';
                    lastSum += num.charAt(n - j - 1) - '0';
                }
                if (firstSum == lastSum) {
                    result++;
                }
            }
        }
        return result;
    }
}