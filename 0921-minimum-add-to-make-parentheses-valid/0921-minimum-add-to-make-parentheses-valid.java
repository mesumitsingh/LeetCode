class Solution {
    public int minAddToMakeValid(String s) {
        int stack = 0, open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack++;
            } else {
                if (stack > 0) {
                    stack--;
                } else {
                    open++;
                }
            }
        }

        return open + stack;
    }
}