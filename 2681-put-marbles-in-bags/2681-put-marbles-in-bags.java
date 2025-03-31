class Solution {
    public long putMarbles(int[] weights, int k) {
        List<Long> list = new ArrayList<>();
        int n = weights.length;
        for (int i = 0; i < n - 1; i++) {
            list.add((long) weights[i] + weights[i + 1]);
        }
        list.sort(Long::compareTo);
        long maxSum = 0, minSum = 0;
        for (int i = 0; i < k - 1; i++) {
            minSum += list.get(i);
            maxSum += list.get(n - 2 - i);
        }

        return maxSum - minSum;
    }
}